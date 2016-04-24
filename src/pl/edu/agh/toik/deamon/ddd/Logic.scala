package pl.edu.agh.toik.deamon.ddd

object Logic extends LogicComponent with TriggerChecker {

  val daemons: List[GamePricesFetcher] = List()
  val triggers  = scala.collection.mutable.Map[String,PriceTrigger]()

  def main(args: Array[String]) {
    println("Hello, world!")
    createGamePricesFetcher(1, 4000)
    createPriceTrigger(1, "Witcher 3", 70)
  }

  def createGamePricesFetcher(userId : Int, refreshingTime : Int){
    val daemon = new GamePricesFetcher(userId, refreshingTime, this)
    val thread = new Thread(daemon).start
    daemons :+ daemon
  }

  def createPriceTrigger(userId : Int, gameName : String, maxPrice : Double): Unit ={
    val trigger = new PriceTrigger(userId, gameName, maxPrice)
    val key = userId + "#" + gameName + "#" + maxPrice + "#"
    triggers(key) = trigger

  }

  def deletePriceTrigger(userId : Int, gameName : String, maxPrice : Double): Unit ={
    val key = userId + "#" + gameName + "#" + maxPrice + "#"
    triggers.remove(key)
  }

  def refreshManually(userId : Int): Unit ={
    for (daemon <- daemons){
      if (userId == daemon._userId){
        daemon.obtainCurentState()
        daemon.activateTriggers()
      }
    }
  }

  def checkTriggers(userId : Int): Unit ={
      for (trigger <- triggers.values){
        if (userId == trigger._userId){
          if (trigger.isPriceBelowMinimal()){
            notify(userId, trigger._gameName, trigger._maxPrice, 123)
            //TODO : figure out a nice way of getting current price of game in this class
          }
        }
      }
  }


  def notify(userId : Int, gameName : String, maxPrice : Double, currentPrice : Double): Unit ={
    //notification logic
  }

}

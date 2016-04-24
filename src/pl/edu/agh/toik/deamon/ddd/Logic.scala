package pl.edu.agh.toik.deamon.ddd

object Logic {

  val daemons: List[Thread] = List()
  val triggers : Map[String, PriceTrigger] = Map()

  def main(args: Array[String]) {
    println("Hello, world!")
    createGamePricesFetcher(1, 1000)
  }

  def createGamePricesFetcher(userId : Int, refreshingTime : Int){
    val thread = new Thread(new GamePricesFetcher(userId, refreshingTime)).start
    daemons :+ thread
  }

  def createPriceTrigger(userId : Int, gameName : String, maxPrice : Double): Unit ={
    val trigger = new PriceTrigger(userId, gameName, maxPrice)
    val key = userId + "#" + gameName + "#" + maxPrice + "#"
    triggers + (key -> trigger)
  }

  def deletePriceTrigger(userId : Int, gameName : String, maxPrice : Double): Unit ={
    val key = userId + "#" + gameName + "#" + maxPrice + "#"
    triggers - key
  }

}

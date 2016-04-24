package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
class GamePricesFetcher(userId : Int, sleepTime : Int, checker : TriggerChecker) extends Runnable {

  def run(){
    while (true){
      println("Game price fetching logic " + userId)
      activateTriggers()
      Thread sleep sleepTime
    }
  }

  def activateTriggers(): Unit ={
    checker.checkTriggers()
  }

}

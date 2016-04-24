package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
class GamePricesFetcher(userId : Int, sleepTime : Int, checker : TriggerChecker) extends Runnable {

  var _userId : Int = userId;

  def run(){
    while (true){
      println("Game price fetching logic " + _userId)
      obtainCurentState()
      activateTriggers()
      Thread sleep sleepTime
    }
  }

  def activateTriggers(): Unit ={
    checker.checkTriggers(_userId)
  }

  def obtainCurentState(): Unit ={

  }

}

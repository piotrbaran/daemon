package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
class GamePricesFetcher(userId : Int, sleepTime : Int) extends Runnable {

  def run(){
    while (true){
      println("Game price fetching logic " + userId)
      Thread sleep sleepTime
    }
  }

}

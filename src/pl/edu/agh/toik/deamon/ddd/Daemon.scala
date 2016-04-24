package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
class Daemon(id : Int, sleepTime : Int) extends Runnable {

  def run(){
    while (true){
      println("Written from thread " + id)
      Thread sleep sleepTime
    }
  }

}

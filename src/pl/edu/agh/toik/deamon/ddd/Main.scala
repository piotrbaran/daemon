package pl.edu.agh.toik.deamon.ddd

object Main {

  def main(args: Array[String]) {
    println("Hello, world!")
    new Thread(new GamePricesFetcher(1, 1000)).start
    new Thread(new GamePricesFetcher(2, 2000)).start

  }

}

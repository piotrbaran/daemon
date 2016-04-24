package pl.edu.agh.toik.deamon.ddd

object Main {

  def main(args: Array[String]) {
    // Prints Hello World
    // This is also an example of single line comment.
    println("Hello, world!")
    new Daemon(1, 1000).run()
    new Daemon(2, 2000).run()

  }

}

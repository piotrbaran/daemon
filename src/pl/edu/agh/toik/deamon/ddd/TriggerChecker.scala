package pl.edu.agh.toik.deamon.ddd

trait TriggerChecker {
  def checkTriggers(userId : String): Unit
}

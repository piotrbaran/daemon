package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
trait LogicComponent {

  def createGamePricesFetcher(userId : Int, refreshingTime : Int)
  def createPriceTrigger(userId : Int, gameName : String, maxPrice : Double)
  def deletePriceTrigger(userId : Int, gameName : String, maxPrice : Double)
  def refreshManually(userId : Int)

}

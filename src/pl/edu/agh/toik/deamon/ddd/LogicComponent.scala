package pl.edu.agh.toik.deamon.ddd

/**
  * Created by Piotr on 2016-04-24.
  */
trait LogicComponent {

  def createGamePricesFetcher(userId : String, refreshingTime : Int)
  def createPriceTrigger(userId : String, gameName : String, maxPrice : Double)
  def deletePriceTrigger(userId : String, gameName : String, maxPrice : Double)
  def refreshManually(userId : String)

}

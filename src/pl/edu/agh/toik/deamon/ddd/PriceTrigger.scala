package pl.edu.agh.toik.deamon.ddd

class PriceTrigger(userId : String, gameName : String, maxPrice : Double) {

  var _userId : String = userId

  var _gameName : String = gameName

  var _maxPrice : Double = maxPrice

  def isPriceBelowMinimal() : Boolean = {
    //fetch data from database
    return getCurrentPriceFromDatabase()< maxPrice
  }

  def getCurrentPriceFromDatabase(): Double ={
    //fetching logic
    return 30
  }
}

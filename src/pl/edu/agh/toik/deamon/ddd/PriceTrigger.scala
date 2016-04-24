package pl.edu.agh.toik.deamon.ddd

class PriceTrigger(userId : Int, gameName : String, maxPrice : Double) {

  var _userId : Int = userId

  var _gameName : String = gameName

  var _maxPrice : Double = maxPrice

  def isPriceBelowMinimal() : Boolean = {
    //fetch data from database
    val currentPrice = getCurrentPriceFromDatabase()
    if (currentPrice < maxPrice){
      return true
    } else {
      return false
    }
  }

  def getCurrentPriceFromDatabase(): Double ={
    //fetching logic
    return 30
  }
}

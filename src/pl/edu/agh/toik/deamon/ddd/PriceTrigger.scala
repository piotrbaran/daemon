package pl.edu.agh.toik.deamon.ddd

class PriceTrigger(userId : Int, gameName : String, maxPrice : Double) {

  def isPriceBelowMinimal() : Boolean = {
    //fetch data from database
    val currentPrice = 30
    if (currentPrice < maxPrice){
      return true
    } else {
      return false
    }
  }
}

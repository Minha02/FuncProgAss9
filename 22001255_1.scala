object InterestCalculator {

  def calculateInterest(deposit: Double): Double = {
    val interestCalculator: Double => Double = depositAmount => {
      depositAmount match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case amount => amount * 0.065
      }
    }

    interestCalculator(deposit)
  }

  def main(args: Array[String]): Unit = {
    println(f"Interest on Rs. 15000 deposit: ${calculateInterest(15000)}%.2f")
    println(f"Interest on Rs. 50000 deposit: ${calculateInterest(50000)}%.2f")
    println(f"Interest on Rs. 1000000 deposit: ${calculateInterest(1000000)}%.2f")
    println(f"Interest on Rs. 2500000 deposit: ${calculateInterest(2500000)}%.2f")
  }
}

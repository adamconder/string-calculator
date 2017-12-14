package stringcalculator

class StringCalculator(digits : String) {

  def add = {
    if(digits.length == 0) 0 else {
      val numbers = digits split ","
      numbers.foldLeft(0)((acc, num) => acc + num.toInt)
    }
  }

}
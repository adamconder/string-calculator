package stringcalculator

class StringCalculator(digits : String) {

  def add = {
    if(digits.length == 0) 0 else {
      val numbers = digits split ","
      (0 /: numbers)(_+_.toInt)
    }
  }

}
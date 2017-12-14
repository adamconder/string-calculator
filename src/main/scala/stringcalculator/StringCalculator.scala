package stringcalculator

class StringCalculator(digits : String) {

  def add = {
    if(digits.length == 0) 0 else {
      val numbers = digits split ",|\n" map(_.toInt)
      (0 /: numbers)(_+_)
    }
  }

}
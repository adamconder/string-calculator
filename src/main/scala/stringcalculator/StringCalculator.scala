package stringcalculator

class StringCalculator(digits : String) {

  def add = {
    if(digits.length == 0) 0 else (0 /: numbers)(_+_)
  }

  private def numbers = digits split ",|\n" map(_.toInt)

}
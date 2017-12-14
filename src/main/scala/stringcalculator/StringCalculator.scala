package stringcalculator

class StringCalculator(digits : String) {

  def add = {
    if(digits.length == 0) 0 else digits.toInt
  }

}
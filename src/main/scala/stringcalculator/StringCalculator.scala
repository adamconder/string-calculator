package stringcalculator

class StringCalculator(rawdigits : String) {

  def add = {
    if(digits.length == 0) 0 else (0 /: numbers)(_+_)
  }

  private def numbers = digits split ",|\n" map(_.toInt)

  def digits = {
    val delimiter_extractor = "//(.)\n(.*)".r

    rawdigits match {
      case delimiter_extractor(delimiter, numbers) => numbers.replace(delimiter, ",")
      case _ => rawdigits
    }
  }
}
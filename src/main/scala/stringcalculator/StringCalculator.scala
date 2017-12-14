package stringcalculator

class StringCalculator(rawdigits : String) {

  def add = (0 /: numbers)(_+_)

  private def numbers = digits split ",|\n" map(_.toInt)

  def digits = {
    val delimiter_extractor = "//(.)\n(.*)".r

    rawdigits match {
      case "" => "0"
      case delimiter_extractor(delimiter, numbers) => numbers.replace(delimiter, ",")
      case _ => rawdigits
    }
  }
}
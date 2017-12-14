package stringcalculator

import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers {

  "StringCalculator" should {

    "return 0 for an empty string" in {
      new StringCalculator("").add() mustEqual 0
    }

  }

}

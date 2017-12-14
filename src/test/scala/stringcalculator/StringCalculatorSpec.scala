package stringcalculator

import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers {

  "StringCalculator" should {

    "return 0 for an empty string" in {
      new StringCalculator("").add mustEqual 0
    }

    "return 1 for 1" in {
      new StringCalculator("1").add mustEqual 1
    }

    "return 42 for 42" in {
      new StringCalculator("42").add mustEqual 42
    }

    "return 3 for 1,2" in {
      new StringCalculator("1,2").add mustEqual 3
    }

  }

}

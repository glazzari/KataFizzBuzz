package main.guila.zenvia;

/**
 * This class implements the FizzBuzz game.
 */
public class KataFizzBuzz {

  private final String labelDiv3;
  private final String labelDiv5;

  public KataFizzBuzz(String labelDiv3, String labelDiv5) {
    this.labelDiv3 = labelDiv3;
    this.labelDiv5 = labelDiv5;
  }

  public KataFizzBuzz() {
    this("Fizz", "Buzz");
  }

  private boolean isDivisibleBy3(int n) {
    return n % 3 == 0;
  }

  private boolean isDivisibleBy5(int n) {
    return n % 5 == 0;
  }

  /**
   * Evaluate a number as follows:
   * - for multiples of three print "Fizz"
   * - for multiples of five print "Buzz"
   * - for numbers which are multiples of both three and five print "FizzBuzz"
   * - otherwise, print the number
   * @param number
   * @return String
   */
  public String evaluate(int number) {
    if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
      return labelDiv3 + labelDiv5;
    } else if (isDivisibleBy3(number)) {
      return labelDiv3;
    } else if (isDivisibleBy5(number)) {
      return labelDiv5;
    } else {
      return String.valueOf(number);
    }
  }
}




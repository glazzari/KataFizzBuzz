package main.guila.zenvia;

/**
 * Created by guila on 03/05/17.
 */
public class KataFizzBuzz {

  private boolean isFizz(int n) {
    return n % 3 == 0;
  }

  private boolean isBuzz(int n) {
    return n % 5 == 0;
  }

  public String run(int n) {
    if (isFizz(n) && isBuzz(n)) {
      return "FizzBuzz";
    } else if (isFizz(n)) {
      return "Fizz";
    } else if (isBuzz(n)) {
      return "Buzz";
    } else {
      return String.valueOf(n);
    }
  }
}

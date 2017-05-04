package test.guila.zenvia;

import static org.junit.Assert.assertEquals;

import main.guila.zenvia.KataFizzBuzz;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by guila on 03/05/17.
 */
public class KataFizzBuzzTest {

  private KataFizzBuzz kfb;

  private static final int ITERATIONS = 100;
  private static final int MAX_VALUE = 5000;

  private int getRandomInt() {
    return (int) (Math.random() * MAX_VALUE);
  }

  private int generateFizz() {
    while (true) {
      int n = getRandomInt();
      if ((n % 3 == 0) && (n % 5 != 0)) {
        return n;
      }
    }
  }

  private int generateBuzz() {
    while (true) {
      int n = getRandomInt();
      if ((n % 3 != 0) && (n % 5 == 0)) {
        return n;
      }
    }
  }

  private int generateFizzBuzz() {
    while (true) {
      int n = getRandomInt();
      if ((n % 3 == 0) && (n % 5 == 0)) {
        return n;
      }
    }
  }

  private int generateNotFizzBuzz() {
    while (true) {
      int n = getRandomInt();
      if ((n % 3 != 0) && (n % 5 != 0)) {
        return n;
      }
    }
  }

  @Before
  public void SetUp() {
    kfb = new KataFizzBuzz();
  }

  @Test
  public void testFizz() {
    for (int i = 0; i < ITERATIONS; i++) {
      assertEquals(kfb.evaluate(generateFizz()), "Fizz");
    }
  }

  @Test
  public void testBuzz() {
    for (int i = 0; i < ITERATIONS; i++) {
      assertEquals(kfb.evaluate(generateBuzz()), "Buzz");
    }
  }

  @Test
  public void testFizzBuzz() {
    for (int i = 0; i < ITERATIONS; i++) {
      assertEquals(kfb.evaluate(generateFizzBuzz()), "FizzBuzz");
    }
  }

  @Test
  public void testNotFizzBuzz() {
    for (int i = 0; i < ITERATIONS; i++) {
      int n = generateNotFizzBuzz();
      assertEquals(kfb.evaluate(n), Integer.toString(n));
    }
  }
}
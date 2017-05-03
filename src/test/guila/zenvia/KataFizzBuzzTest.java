package test.guila.zenvia;

import static org.junit.Assert.assertEquals;

import main.guila.zenvia.KataFizzBuzz;
import org.junit.Test;

/**
 * Created by guila on 03/05/17.
 */
public class KataFizzBuzzTest {

  KataFizzBuzz kfb = new KataFizzBuzz();

  @Test
  public void run() throws Exception {
    assertEquals(kfb.run(1), "1");
    assertEquals(kfb.run(2), "2");
    assertEquals(kfb.run(3), "Fizz");
    assertEquals(kfb.run(5), "Buzz");
    assertEquals(kfb.run(15), "FizzBuzz");
  }
}
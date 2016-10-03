package in.tdd.money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ajuyal on 03/10/16.
 */
public class DollarTest {
  @Test
  public void
  should_test_multiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }

  private class Dollar {
    public int amount;

    public Dollar(int amount) {

    }

    public void times(int multiplier) {

    }
  }
}

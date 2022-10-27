package example02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.bht.pr2.lession02.Car;
import org.junit.jupiter.api.Test;

class Example02a {

  // Several @Tests are executed in an abritary order

  @Test
  void testSpeed() {
    Car auto = new Car("Audi", "gelb", "Berlin", 10000);
    auto.accelerateUntil(100);
    assertEquals(100, auto.getSpeed());
    auto.doBreak();
    assertEquals(0, auto.getSpeed());
  }

  @Test
  void testPositionAndLocation() {
    Car auto = new Car("Audi", "gelb", "Berlin", 10000);
    auto.drive("Hamburg", 300);
    assertEquals("Hamburg", auto.getPosition());
    assertEquals(10300, auto.getKmStatus());
  }
}

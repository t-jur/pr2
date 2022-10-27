package example05;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import de.bht.pr2.lession02.Car;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Example05Test {

  // assertAll()-Methode

  @Test
  @Disabled
    // TODO: remove annotation to see effect
  void testPosistionAndKmStatus() {
    Car auto = new Car("Audi", "gelb", "Berlin", 10000);
    auto.drive("Hamburg", 300);
    assertAll("Alle Zeilen werden ausgefuehrt",
        () -> assertEquals("Hamburg Nord", auto.getPosition()),
        () -> assertEquals(10300, auto.getKmStatus())
    );
  }
}

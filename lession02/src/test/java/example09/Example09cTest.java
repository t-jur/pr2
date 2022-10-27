package example09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.bht.pr2.lession02.Car;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class Example09cTest {

  // Nicht-static Variablen werden vor jedem @Test
  // erneut zugewiesen

  Car[] autos = {
      new Car("Audi", "gelb", "Berlin", 10000),
      new Car("BMW", "rot", "Hamburg", 20000),
      new Car("Porsche", "blau", "Potsdam", 30000),
      new Car("VW", "gruen", "Cottbus", 40000)
  };

  @Test
  void test1() {
    assertEquals("Potsdam", autos[2].getPosition());
  }

  @Test
  void test2() {
    List<Car> autosAlsList = Arrays.asList(autos);
    Collections.shuffle(autosAlsList);
    autosAlsList.toArray(autos);
    assertEquals(4, autos.length);
  }

  @Test
  void test3() {
    autos[3] = new Car("Opel", "schwarz", "Leipzig", 50000);
    assertFalse(autos[3].getPosition().equals("Cottbus"));
  }

  @Test
  void test4() {
    assertTrue(autos[3].getPosition().equals("Cottbus"));
  }
}

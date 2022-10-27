package example03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.bht.pr2.lession02.Car;
import org.junit.jupiter.api.Test;

class Example03Test {

  // assertEquals()-Methode for Objects
  // The equals()-Method of the object is called

  @Test
  void test() {
    Car annasAuto = new Car("Audi", "gelb", "Berlin", 10000);
    Car bobsAuto = new Car("Audi", "gelb", "Hamburg", 22222);

    assertEquals(annasAuto, bobsAuto); // annasAuto.equals(bobsAuto) ...
  }
}

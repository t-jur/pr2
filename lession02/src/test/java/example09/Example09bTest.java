package example09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import de.bht.pr2.lession02.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Example09bTest {

  // @BeforeAll, @AfterAll
  // @BeforeEach, @AfterEach

  static List<Car> autos = null;

  @BeforeAll
  static void init() {
    autos = new ArrayList<Car>();
  }

  @AfterAll
  static void done() {
    autos = null;
  }

  @BeforeEach
  void setUp() {
    Car annasAuto = new Car("Audi", "gelb", "Berlin", 10000);
    Car bobsAuto = new Car("BMW", "rot", "Hamburg", 20000);
    Car carlasAuto = new Car("Porsche", "blau", "Potsdam", 30000);
    Car danielsAuto = new Car("VW", "gruen", "Cottbus", 40000);

    autos.clear();
    autos.add(annasAuto);
    autos.add(bobsAuto);
    autos.add(carlasAuto);
    autos.add(danielsAuto);
  }

  @Test
  void test1() {
    assertEquals("Potsdam", autos.get(2).getPosition());
  }

  @Test
  void test2() {
    Collections.shuffle(autos);
    assertEquals(4, autos.size());
  }

  @Test
  void test3() {
    Car danielsNeuesAuto = new Car("Opel", "schwarz", "Leipzig", 50000);
    autos.set(3, danielsNeuesAuto);
    assertFalse(autos.get(3).getPosition().equals("Cottbus"));
  }

  @AfterEach
  void tearDown() {
    autos.clear();
  }
}

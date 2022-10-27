package example04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import de.bht.pr2.lession02.example04.SomeClass;
import org.junit.jupiter.api.Test;

class Example04Test {

  // assertArrayEquals()-Methode

  @Test
  void test() {
    int[] erwartet = {1, 2, 3, 4, 5};
    assertArrayEquals(erwartet, SomeClass.getArray());
  }
}

package example06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.bht.pr2.lession02.example06.Units;
import org.junit.jupiter.api.Test;

class Example06Test {

  // assertTrue()-Methode
  // assertFalse()-Methode

  @Test
  void testAssertTrue() {
    boolean kgIsAUnit = Units.isA("Kg");
    assertTrue(kgIsAUnit);
  }

  @Test
  void testAssertFalse() {
    boolean keKsIsAUnit = Units.isA("Keks");
    assertFalse(keKsIsAUnit);
  }
}

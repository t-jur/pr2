package example08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Example08Test {

  // fail()-Methode
  // @Disabled-Annotation

  @Test
  void testFail() {
    //fail("Ach nein..."); TODO: remove comment to see effect
    assertEquals(1, 1); // Wird nicht ausgefuehrt
    System.out.println("Ich werde auch nicht gedruckt");
  }

  @Test
  @Disabled
  void testDisabled() {
    fail("Ha ha, ich werde nicht ausgefuehrt!");
  }
}

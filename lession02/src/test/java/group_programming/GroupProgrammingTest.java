package group_programming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.bht.pr2.lession02.gruppen.SomeMathClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupProgrammingTest {

  @Test
  void testMathe() {
    int a = 10;
    int b = 20;
    Assertions.assertEquals(170, SomeMathClass.mathe(a, b));
  }

  @Test
  void testStringAbkuerzen() {
    String s = "Mary has a little lamb";
    assertEquals("Mhall", SomeMathClass.abbreviations(s));
  }
}

package example07;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class Example07Test {

  // assertThrows()-Method

  @Test
  void testAssertThrows() {
    int[] array = {1, 2, 3, 4, 5};
    assertThrows(ArrayIndexOutOfBoundsException.class,
        () -> array[999] = 12345);
  }

  @Test
  void testAssertThrowsSuperclass() {
    int[] array = {1, 2, 3, 4, 5};
    assertThrows(IndexOutOfBoundsException.class,
        () -> array[999] = 12345);
  }
}

package example09;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Example09aTest {

  // @BeforeAll, @AfterAll
  // @BeforeEach, @AfterEach

  @BeforeAll
  static void init() {
    System.out.println("init()");
  }

  @AfterAll
  static void done() {
    System.out.println("done()");
  }

  @BeforeEach
  void setUp() {
    System.out.println("setUp()");
  }

  @Test
  void test1() {
    System.out.println("test1()");
  }

  @Test
  void test2() {
    System.out.println("test2()");
  }

  @Test
  void test3() {
    System.out.println("test3()");
  }

  @AfterEach
  void tearDown() {
    System.out.println("tearDown()");
  }
}

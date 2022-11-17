package de.bht.pr2.lession04.common;

import java.util.Objects;

public class Person {

  //----------------------------
  // Attribute
  protected String name = "";

  //----------------------------
  // Konstruktor
  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [" +
        "name='" + name +
        ']';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Person person = (Person) o;

    return Objects.equals(name, person.name);
  }

  public int hashCode() {
    return Objects.hash(name);
  }
}

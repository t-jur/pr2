package de.bht.pr2.lession02.example01;

import de.bht.pr2.lession02.Car;

public class Example01_MainProgramm {

  // Bis dahin haben wir mit Gucken
  // ein Programm getestet

  public static void main(String[] args) {
    Car auto = new Car("Audi", "gelb", "Berlin", 10000);
    System.out.println(auto);

    auto.drive("Hamburg", 300);
    System.out.println("-----------------");
    System.out.println(auto);
  }
}

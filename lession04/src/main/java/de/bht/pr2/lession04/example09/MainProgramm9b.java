package de.bht.pr2.lession04.example09;

import de.bht.pr2.lession04.common.Person;
import de.bht.pr2.lession04.common.Schiff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProgramm9b {

  // Objekt als Map-Schluessel
  // Collection als Map-Wert

  public static void main(String[] args) {
    //----------------------------------
    // Listen von Schiffen erzeugen
    Schiff schiffAnna1 = new Schiff("Anna 1", 10, 20);
    Schiff schiffAnna2 = new Schiff("Anna 2", 10, 30);
    List<Schiff> annasSchiffe = new ArrayList<Schiff>();
    annasSchiffe.add(schiffAnna1);
    annasSchiffe.add(schiffAnna2);

    Schiff schiffBob1 = new Schiff("Bob 1", 10, 20);
    Schiff schiffBob2 = new Schiff("Bob 2", 10, 30);
    List<Schiff> bobsSchiffe = new ArrayList<Schiff>();
    bobsSchiffe.add(schiffBob1);
    bobsSchiffe.add(schiffBob2);

    //----------------------------------
    // Besitzer erzeugen
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");

    //----------------------------------
    // Besitzer --> Sammlung von Schiffen
    Map<Person, List<Schiff>> besitzerZuSchiffen =
        new HashMap<>();
    besitzerZuSchiffen.put(anna, annasSchiffe);
    besitzerZuSchiffen.put(bob, bobsSchiffe);

    System.out.println(); // Fuer Breakpoint und Debugger gedacht
  }
}

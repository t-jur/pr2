package de.bht.pr2.lession04.example09;

import de.bht.pr2.lession04.common.Schiff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProgramm9a {

  // String als Map-Schluessel
  // Collection als Map-Wert

  public static void main(String[] args) {
    //----------------------------------
    // Listen von Schiffen erzeugen
    Schiff schiffAnna1 = new Schiff("Anna 1", 10, 20);
    Schiff schiffAnna2 = new Schiff("Anna 2", 10, 30);
    List<Schiff> annasSchiffe = new ArrayList<>();
    annasSchiffe.add(schiffAnna1);
    annasSchiffe.add(schiffAnna2);

    Schiff schiffBob1 = new Schiff("Bob 1", 10, 20);
    Schiff schiffBob2 = new Schiff("Bob 2", 10, 30);
    List<Schiff> bobsSchiffe = new ArrayList<>();
    bobsSchiffe.add(schiffBob1);
    bobsSchiffe.add(schiffBob2);

    //----------------------------------
    // Besitzer-Name --> Sammlung von Schiffen
    Map<String, List<Schiff>> besitzerNamenZuSchiffen =
        new HashMap<>();
    besitzerNamenZuSchiffen.put("Anna Alt", annasSchiffe);
    besitzerNamenZuSchiffen.put("Bob Berg", bobsSchiffe);

    System.out.println(); // Fuer Breakpoint und Debugger gedacht
  }
}

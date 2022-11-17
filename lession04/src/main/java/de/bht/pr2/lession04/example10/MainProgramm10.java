package de.bht.pr2.lession04.example10;

import de.bht.pr2.lession04.common.Person;
import de.bht.pr2.lession04.common.Schiff;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProgramm10 {

  // Objekt als Map-Schluessel
  // Collection als Map-Wert
  // Vorhandenes vs. neues Schluessel-Wert-Paar

  public static void main(String[] args) {
    //----------------------------------
    // Liste von Schiffen erzeugen
    Schiff schiffAnna1 = new Schiff("Anna 1", 10, 20, "Anna Alt");
    Schiff schiffAnna2 = new Schiff("Anna 2", 10, 30, "Anna Alt");
    Schiff schiffBob1 = new Schiff("Bob 1", 10, 20, "Bob Berg");
    Schiff schiffBob2 = new Schiff("Bob 2", 10, 30, "Bob Berg");

    List<Schiff> alleSchiffe = new ArrayList<Schiff>();
    alleSchiffe.add(schiffAnna1);
    alleSchiffe.add(schiffAnna2);
    alleSchiffe.add(schiffBob1);
    alleSchiffe.add(schiffBob2);

    //----------------------------------
    // Map erzeugen
    Map<Person, List<Schiff>> besitzerZuSchiffen =
        new HashMap<Person, List<Schiff>>();

    //----------------------------------
    // Inhalt einfuegen
    for (Schiff schiff : alleSchiffe) {
      String besitzerName = schiff.getBesitzerName();
      Person besitzer = new Person(besitzerName);
      System.out.print("Besitzer: " + besitzer);

      List<Schiff> zielListe = null; // Platz reservieren

      if (besitzerZuSchiffen.containsKey(besitzer)) {
        zielListe = besitzerZuSchiffen.get(besitzer);
        // Vorhandenen Wert zugreifen
        System.out.println(" -- Name schon da");
      } else {
        zielListe = new ArrayList<Schiff>();
        // Neuen Wert erzeugen
        besitzerZuSchiffen.put(besitzer, zielListe);
        // Neues Schluessel-Wert-Paar
        // in der Map speichern
        System.out.println(" -- neuer Namen");
      }

      // Egal ob der Besitzer-Name neu oder vorhanden ist,
      // ist zielListe jetzt initialisiert
      zielListe.add(schiff);
    }

    System.out.println(); // Fuer Breakpoint und Debugger gedacht
  }
}

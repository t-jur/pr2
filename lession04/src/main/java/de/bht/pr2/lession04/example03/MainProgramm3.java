package de.bht.pr2.lession04.example03;

import de.bht.pr2.lession04.common.Schiff;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainProgramm3 {

  // HashMap - Methoden

  public static void main(String[] args) {
    System.out.println("----- Am Anfang -----");
    Map<String, Schiff> nameToShip = new HashMap<String, Schiff>();

    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    System.out.println(nameToShip);

    System.out.println("----- containsKey(\"Blaue Krabben\") -----");
    boolean containsBlaueKrabben = nameToShip.containsKey("Blaue Krabben");
    System.out.println(containsBlaueKrabben);

    System.out.println("----- size() -----");
    int groesse = nameToShip.size();
    System.out.println("Groesse: " + groesse);

    System.out.println("----- values() -----");
    Collection<Schiff> schiffe = nameToShip.values();
    for (Schiff s : schiffe) {
      System.out.println(s);
    }

    System.out.println("----- isEmpty() -----");
    boolean leer = nameToShip.isEmpty();
    System.out.println(leer + " :: " + nameToShip);

    System.out.println("----- clear() -----");
    nameToShip.clear();
    System.out.println(nameToShip);

    System.out.println("----- isEmpty() -----");
    leer = nameToShip.isEmpty();
    System.out.println(leer + " :: " + nameToShip);

    System.out.println("----- putAll() -----");
    Schiff schiff4 = new Schiff("Blah 4", 30, 10);
    Schiff schiff5 = new Schiff("Blah 5", 30, 10);
    Schiff schiff6 = new Schiff("Blah 6", 30, 10);

    Map<String, Schiff> blah = new HashMap<String, Schiff>();

    blah.put(schiff4.getName(), schiff4);
    blah.put(schiff5.getName(), schiff5);
    blah.put(schiff6.getName(), schiff6);

    nameToShip.putAll(blah);

    System.out.println(nameToShip);
  }
}

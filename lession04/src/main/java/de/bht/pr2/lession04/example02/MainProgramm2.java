package de.bht.pr2.lession04.example02;


import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;

public class MainProgramm2 {

  // HashMap - Methoden

  public static void main(String[] args) {
    System.out.println("----- Am Anfang -----");
    Map<String, Schiff> nameToShip = new HashMap<>();
    System.out.println(nameToShip);

    System.out.println("----- put() -----");
    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    System.out.println(nameToShip);

    System.out.println("----- get(\"Blaue Krabben\") -----");
    Schiff schiffB = nameToShip.get("Blaue Krabben");
    System.out.println(schiffB);

    System.out.println("----- put(\"Blaue Krabben\", schiff2) d.h. Wert ersetzen -----");
    nameToShip.put("Blaue Krabben", schiff2);
    System.out.println(nameToShip);

    System.out.println("----- remove(\"Blaue Krabben\") -----");
    nameToShip.remove("Blaue Krabben");
    System.out.println(nameToShip);
  }
}

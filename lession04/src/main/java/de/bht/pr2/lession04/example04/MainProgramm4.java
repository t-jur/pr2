package de.bht.pr2.lession04.example04;

import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainProgramm4 {

  // HashMap - Schluessel-Wert-Paare durchlaufen

  public static void main(String[] args) {
    Map<String, Schiff> namenZuSchiffen = new HashMap<String, Schiff>();

    Schiff schiff1 = new Schiff("Flotte Quelle", 30, 7);
    Schiff schiff2 = new Schiff("Freier Wind", 6, 2);
    Schiff schiff3 = new Schiff("Blaue Krabben", 42, 9);

    namenZuSchiffen.put(schiff1.getName(), schiff1);
    namenZuSchiffen.put(schiff2.getName(), schiff2);
    namenZuSchiffen.put(schiff3.getName(), schiff3);

    // Mit for-Schleife und keySet()
    System.out.println("----- for-Schleife und keySet() -----");
    Set<String> namen = namenZuSchiffen.keySet();
    for (String name : namen) {
      System.out.println(name + " --> " + namenZuSchiffen.get(name));
    }

    // Mit for-Schleife und entrySet()
    System.out.println("----- for-Schleife und entrySet() -----");
    Set<Entry<String, Schiff>> entries = namenZuSchiffen.entrySet();
    for (Entry<String, Schiff> entry : entries) {
      System.out.println(entry.getKey() + " --> " + entry.getValue());
    }
  }
}

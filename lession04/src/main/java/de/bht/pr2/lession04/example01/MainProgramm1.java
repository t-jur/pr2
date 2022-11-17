package de.bht.pr2.lession04.example01;


import de.bht.pr2.lession04.common.Schiff;
import java.util.HashMap;
import java.util.Map;

public class MainProgramm1 {

  // HashMap erzeugen

  public static void main(String[] args) {
    //----------------------------
    // Eingabe: nichts
    Map<String, Schiff> nameToShip = new HashMap<>();

    //----------------------------
    // Eingabe: eine Map
    Schiff schiff1 = new Schiff("a", 10, 20);
    Schiff schiff2 = new Schiff("b", 10, 30);
    Schiff schiff3 = new Schiff("c", 20, 20);

    nameToShip.put(schiff1.getName(), schiff1);
    nameToShip.put(schiff2.getName(), schiff2);
    nameToShip.put(schiff3.getName(), schiff3);

    Map<String, Schiff> namenZuSchiffen2 = new HashMap<>(nameToShip);

    System.out.println(namenZuSchiffen2);
  }
}

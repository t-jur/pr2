package de.bht.pr2.lession03.example15;

import de.bht.pr2.lession03.example03.schiff.Schiff;
import java.util.HashSet;
import java.util.Set;

public class MainProgramm15 {

  /* Ohne equals()- und hashCode()-Methode sind zwei Schiffe nur gleich,
  wenn ihre Referenz-Variablen auf das selbe Objekt zeigen. */

  public static void main(String[] args) {
    //-----------------------------
    // Schiffe erzeugen
    Schiff schiffA1 = new Schiff("A", 40, 20);
    Schiff schiffA2 = new Schiff("A", 40, 20);

    Schiff schiffB1 = new Schiff("B", 40, 20);
    Schiff schiffB2 = new Schiff("B", 40, 20);

    //-----------------------------
    // Set erzeugen
    Set<Schiff> setVonSchiffen = new HashSet<>();
    setVonSchiffen.add(schiffA1);
    setVonSchiffen.add(schiffA2);
    setVonSchiffen.add(schiffB1);
    setVonSchiffen.add(schiffB2);

    for (Schiff s : setVonSchiffen) {
      System.out.println(s);
    }
  }
}

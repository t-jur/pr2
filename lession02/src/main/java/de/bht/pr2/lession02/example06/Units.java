package de.bht.pr2.lession02.example06;

public class Units {

  public static boolean isA(String unit) {
    return unit.equalsIgnoreCase("Kg") ||
        unit.equalsIgnoreCase("Pound");
  }
}

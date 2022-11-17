package de.bht.pr2.lession03.example12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainProgramm12 {

  // HashSet erzeugen

  public static void main(String[] args) {
    //----------------------------
    // Eingabe: nichts
    Set<String> set1 = new HashSet<>();
    set1.add("a");
    set1.add("b");
    set1.add("c");
    set1.add("d");
    set1.add("e");
    set1.add("f");
    System.out.println(set1);

    //----------------------------
    // Eingabe: eine Collection
    Set<String> set2 = new HashSet<>(set1); // Set ist eine Collection
    System.out.println(set2);

    List<String> liste = new ArrayList<>(set1);
    Set<String> set3 = new HashSet<>(liste); // List ist eine Collection
    System.out.println(set3);
  }
}

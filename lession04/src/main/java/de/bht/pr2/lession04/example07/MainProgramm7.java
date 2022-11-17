package de.bht.pr2.lession04.example07;

public class MainProgramm7 {

  // Collection als Attribut

  public static void main(String[] args) {
    Auto annasAuto = new Auto("rot", 4, true, AutoMarke.AUDI);

    System.out.println(annasAuto);

    annasAuto.ausruestungEntfernen("Ersatzrad");

    System.out.println(annasAuto);

    annasAuto.ausruestungInstallieren("Starthilfeset");

    System.out.println(annasAuto);
  }
}

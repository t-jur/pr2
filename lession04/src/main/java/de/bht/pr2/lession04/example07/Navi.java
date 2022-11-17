package de.bht.pr2.lession04.example07;

public class Navi {

  // Attribute
  private String marke = "unbekannt";
  private String stimme = "weiblich"; // maennlich oder weiblich

  // Konstruktor
  public Navi(String marke, String stimme) {
    this.marke = marke;
    this.stimme = stimme;
  }

  // Methode
  public void leiten(String adresse) {
    System.out.println("Die Route nach " + adresse + " wird gesucht...");
    System.out.println("Die Route ist gefunden.");
    System.out.println("Bitte in 300 Metern links abbiegen.");
  }
}

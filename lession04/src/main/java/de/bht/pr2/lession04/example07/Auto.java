package de.bht.pr2.lession04.example07;

import java.util.HashMap;
import java.util.Map;

public class Auto {

  //-------------------
  // Attribute
  private String farbe = "unbekannt";
  private int anzahlVonTueren = 4;
  private boolean schiebedach = true;
  private boolean lichtAn = false;
  private int geschwindigkeit = 0;
  private AutoMarke marke = null;

  //===== NEU =====
  private Map<String, Boolean> sonstigeAusruestungen = null;

  //-------------------
  // Konstruktor
  public Auto(String farbe, int anzahlVonTueren, boolean schiebedach,
      AutoMarke marke) { // Enum-Wert als Eingabe
    this.farbe = farbe;
    this.anzahlVonTueren = anzahlVonTueren;
    this.schiebedach = schiebedach;
    this.marke = marke; // Enum-Wert zuweisen

    //===== NEU =====
    sonstigeAusruestungen = new HashMap<String, Boolean>();
    // Nach Standard vorhanden
    sonstigeAusruestungen.put("Ersatzrad", true);
    sonstigeAusruestungen.put("Warndreieck", true);
    // Nach Standard nicht vorhanden
    sonstigeAusruestungen.put("Eiskratzer", false);
  }

  //-------------------
  // Methoden

  //===== NEU =====
  public void ausruestungEntfernen(String ausruestung) {
    sonstigeAusruestungen.put(ausruestung, false);
  }

  //===== NEU =====
  public void ausruestungInstallieren(String ausruestung) {
    sonstigeAusruestungen.put(ausruestung, true);
  }

  public void bremsen() {
    while (geschwindigkeit > 0) {
      geschwindigkeit--;
    }
  }

  public int getAnzahlVonTueren() { // Getter
    return anzahlVonTueren;
  }

  public String getFarbe() { // Getter
    return farbe;
  }

  public int getGeschwindigkeit() { // Getter
    return geschwindigkeit;
  }

  public boolean getLichtAn() { // Getter
    return lichtAn;
  }

  public AutoMarke getMarke() { // Getter
    return marke;
  }

  public boolean getSchiebedach() { // Getter
    return schiebedach;
  }

  public void lichtAnmachen() {
    if (!lichtAn) {
      lichtAn = true;
    }
  }

  public void naviBenutzen(String marke, String stimme, String adresse) {
    Navi tomtom = new Navi(marke, stimme);
    tomtom.leiten(adresse);
  }

  public void setAnzahlVonTueren(int anzahlVonTueren) { // Setter
    this.anzahlVonTueren = anzahlVonTueren;
  }

  public void setFarbe(String farbe) { // Setter
    // Eventuell Pruefung oder Anpassung, z.B.
    if (!farbe.equals("durchsichtig")) {
      this.farbe = farbe;
    }
  }

  public void setGeschwindigkeit(int geschwindigkeit) { // Setter
    this.geschwindigkeit = geschwindigkeit;
  }

  public void setMarke(AutoMarke marke) { // Setter
    this.marke = marke;
  }

  public void setLichtAn(boolean lichtAn) { // Setter
    this.lichtAn = lichtAn;
  }

  public void setSchiebedach(boolean schiebedach) { // Setter
    this.schiebedach = schiebedach;
  }

  public void tuerAufmachen(String tuer) {
    System.out.println("Tuer " + tuer + " auf");
  }

  public void tuerenAufmachen() {
    tuerAufmachen("links vorne");
    tuerAufmachen("rechts vorne");
    tuerAufmachen("links hinten");
    tuerAufmachen("rechts hinten");
  }

  @Override
  public String toString() {
    return "Auto [" +
        "farbe='" + farbe +
        ", anzahlVonTueren=" + anzahlVonTueren +
        ", schiebedach=" + schiebedach +
        ", lichtAn=" + lichtAn +
        ", geschwindigkeit=" + geschwindigkeit +
        ", marke=" + marke +
        ", sonstigeAusruestungen=" + sonstigeAusruestungen +
        ']';
  }
}

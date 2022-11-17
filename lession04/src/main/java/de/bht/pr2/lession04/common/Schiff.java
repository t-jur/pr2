package de.bht.pr2.lession04.common;

import java.util.Objects;

public class Schiff {

  // Attribute
  protected String name = "";
  protected int laenge = 0;
  protected int breite = 0;
  protected String besitzerName = "";

  // Konstruktoren
  public Schiff(String name, int laenge, int breite) {
    this(name, laenge, breite, "unbekannt");
  }

  public Schiff(String name, int laenge, int breite, String besitzerName) {
    this.name = name;
    this.laenge = laenge;
    this.breite = breite;
    this.besitzerName = besitzerName;
  }

  public String getBesitzerName() {
    return besitzerName;
  }

  public int getBreite() {
    return breite;
  }

  public int getLaenge() {
    return laenge;
  }

  public String getName() {
    return name;
  }

  public void setBesitzerName(String besitzerName) {
    this.besitzerName = besitzerName;
  }

  public void setBreite(int breite) {
    this.breite = breite;
  }

  public void setLaenge(int laenge) {
    this.laenge = laenge;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void steuern(int winkel, String linksOderRechts) {
    System.out.println("Schiff biegt " + winkel
        + " Grad " + linksOderRechts + " ab.");
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Schiff schiff = (Schiff) o;

    if (laenge != schiff.laenge) {
      return false;
    }
    if (breite != schiff.breite) {
      return false;
    }
    return Objects.equals(name, schiff.name);
  }

  public int hashCode() {
    return Objects.hash(name, laenge, breite);
  }

  @Override
  public String toString() {
    return "Schiff [" +
        "name='" + name +
        ", laenge=" + laenge +
        ", breite=" + breite +
        ", besitzerName='" + besitzerName +
        ']';
  }
}

	
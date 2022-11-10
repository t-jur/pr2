package de.bht.pr2.lab02.part1;

import java.util.Arrays;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";
  private int matrikelnummer = 0;
  private String studiengang = "";

  public static final int RUECKMELDUNG_GEBUEHR = 312;
  public static final String[] FVI = {"Data Science", "Druck- und Medientechnik", "IT-Sicherheit Online", "Medieninformatik", "Medieninformatik Online", "Screen Based Media", "Technische Informatik"};

  //-------------------------------
  // Konstruktor
  // Passen Sie den Konstruktor an
  //-------------------------------
  public Student(String datenZeile) throws StudentParseException, RegistrationNumberException, WrongCourseOfStudiesException, NotPaidTuitionFeeException{

      String[] inputarr = datenZeile.split(",");
      if (inputarr.length != 4){
        System.out.println(datenZeile);
        throw new StudentParseException(datenZeile);
      }

      this.name = inputarr[0];
      try {
        this.matrikelnummer = Integer.parseInt(inputarr[1]);
      } catch(NumberFormatException e){
        throw new RegistrationNumberException(inputarr[1]);
    }
      this.studiengang = inputarr[2];
      if (!Arrays.asList(FVI).contains(inputarr[2])){
        throw new WrongCourseOfStudiesException(inputarr[2]);
    }

    if (Integer.parseInt(inputarr[3]) < RUECKMELDUNG_GEBUEHR){
      int diff = RUECKMELDUNG_GEBUEHR-Integer.parseInt(inputarr[3]);
      throw new NotPaidTuitionFeeException(String.valueOf(diff));
    }

  }


  //-------------------------------------------
  // Methoden
  public int getMatrikelnummer() {
    return matrikelnummer;
  }

  public String getName() {
    return name;
  }

  public String getStudiengang() {
    return studiengang;
  }

  public void setMatrikelnummer(int matrikelnummer) {
    this.matrikelnummer = matrikelnummer;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStudiengang(String studiengang) {
    this.studiengang = studiengang;
  }

  public String toString() {
    return "name: " + name
        + ", matrikelnummer: " + matrikelnummer +
        ", studiengang:" + studiengang;
  }
}

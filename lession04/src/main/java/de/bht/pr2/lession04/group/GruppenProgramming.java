package de.bht.pr2.lession04.group;


import de.bht.pr2.lession04.example07.Auto;
import de.bht.pr2.lession04.example07.AutoMarke;
import java.util.HashMap;
import java.util.Map;

public class GruppenProgramming {

  // Aufgaben:
  // (1) Map erzeugen: farbe --> Auto
  // (2) das blaue Auto zugreifen

  public static void main(String[] args) {
    Auto autoRot = new Auto("rot", 4, true, AutoMarke.AUDI);
    Auto autoGelb = new Auto("gelb", 4, true, AutoMarke.BMW);
    Auto autoBlau = new Auto("blau", 4, true, AutoMarke.PORSCHE);
    Auto autoGruen = new Auto("gruen", 4, true, AutoMarke.VOLKSWAGEN);

    Map<String, Auto> farbenZuAutos = new HashMap<String, Auto>();
    farbenZuAutos.put(autoRot.getFarbe(), autoRot);
    farbenZuAutos.put(autoGelb.getFarbe(), autoGelb);
    farbenZuAutos.put(autoBlau.getFarbe(), autoBlau);
    farbenZuAutos.put(autoGruen.getFarbe(), autoGruen);

    Auto autoZuZugreifen = farbenZuAutos.get("blau");
    System.out.println(autoZuZugreifen);
  }
}

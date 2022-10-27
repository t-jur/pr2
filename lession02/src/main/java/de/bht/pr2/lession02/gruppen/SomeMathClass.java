package de.bht.pr2.lession02.gruppen;

public class SomeMathClass {

  public static int mathe(int a, int b) {
    return (a * b) - (a + b);
  }

  public static String abbreviations(String s) {
    // Input: Anna Bob carla daniel
    // Output: ABcd
    String returnString = "";

    String[] tokens = s.split(" ");
    for (String token : tokens) {
      returnString += token.charAt(0);
    }

    return returnString;
  }
}

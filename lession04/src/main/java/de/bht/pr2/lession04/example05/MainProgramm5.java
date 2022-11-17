package de.bht.pr2.lession04.example05;

import de.bht.pr2.lession04.common.Person;
import java.util.HashSet;
import java.util.Set;

public class MainProgramm5 {

  // Operationen mit Collection-Objekten -- HashSet

  private static Set<Person> setA = null;
  private static Set<Person> setB = null;

  private static void listenErzeugen() {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");

    setA = new HashSet<>();
    setA.add(anna);
    setA.add(bob);
    setA.add(carla);

    setB = new HashSet<>();
    setB.add(bob);
    setB.add(carla);
    setB.add(daniel);
  }

  public static void main(String[] args) {
    //----------------------------------
    // addAll()
    listenErzeugen();
    setA.addAll(setB);
    System.out.println("----- addAll() -----");
    System.out.println(setA);

    //----------------------------------
    // removeAll()
    listenErzeugen();
    setA.removeAll(setB);
    System.out.println("----- removeAll() -----");
    System.out.println(setA);

    //----------------------------------
    // retainAll()
    listenErzeugen();
    setA.retainAll(setB);
    System.out.println("----- retainAll() -----");
    System.out.println(setA);
  }
}

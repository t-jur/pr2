package de.bht.pr2.lession04.example06;

import de.bht.pr2.lession04.common.Person;
import java.util.ArrayList;
import java.util.List;

public class MainProgramm6 {

  // Operationen mit Collection-Objekten -- ArrayList

  private static List<Person> listA = null;
  private static List<Person> listB = null;

  private static void listenErzeugen() {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");

    listA = new ArrayList<Person>();
    listA.add(anna);
    listA.add(bob);
    listA.add(carla);

    listB = new ArrayList<Person>();
    listB.add(bob);
    listB.add(carla);
    listB.add(daniel);
  }

  public static void main(String[] args) {
    //----------------------------------
    // addAll()
    listenErzeugen();
    listA.addAll(listB);
    System.out.println("----- addAll() -----");
    System.out.println(listA);

    //----------------------------------
    // removeAll()
    listenErzeugen();
    listA.removeAll(listB);
    System.out.println("----- removeAll() -----");
    System.out.println(listA);

    //----------------------------------
    // retainAll()
    listenErzeugen();
    listA.retainAll(listB);
    System.out.println("----- retainAll() -----");
    System.out.println(listA);
  }
}

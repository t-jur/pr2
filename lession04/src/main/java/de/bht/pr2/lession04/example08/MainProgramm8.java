package de.bht.pr2.lession04.example08;

import de.bht.pr2.lession04.common.Person;
import java.util.ArrayList;
import java.util.List;

public class MainProgramm8 {

  // Verschachtelte List:
  // List als List-Element

  public static void main(String[] args) {
    Person anna = new Person("Anna Alt");
    Person bob = new Person("Bob Berg");
    Person carla = new Person("Carla Carsten");
    Person daniel = new Person("Daniel Dorf");
    Person eli = new Person("Eli Eiche");
    Person florian = new Person("Florian Fein");

    List<Person> gruppeA = new ArrayList<>();
    gruppeA.add(anna);

    List<Person> gruppeB = new ArrayList<>();
    gruppeB.add(bob);
    gruppeB.add(carla);
    gruppeB.add(daniel);

    List<Person> gruppeC = new ArrayList<>();
    gruppeC.add(eli);
    gruppeC.add(florian);

    List<List<Person>> gruppen = new ArrayList<>();
    gruppen.add(gruppeA);
    gruppen.add(gruppeB);
    gruppen.add(gruppeC);

    System.out.println(gruppen);
  }
}

package org.fasttrackit.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        List<Person> personList = new ArrayList<>();

          Person pers1 = personService.addPerson(new Person("John",34));
        //Person pers1 = personService.addPerson(null);

        System.out.println(String.format("Id %d nume %s varsta %d", pers1.getId(), pers1.getName(), pers1.getAge()));
        System.out.println(pers1.toString());



//        for (int i = 0; i < 10; i++) {
//            Person prs = new Person("Daniel", i);
//            System.out.println(prs.getId());
//        }
    }
}

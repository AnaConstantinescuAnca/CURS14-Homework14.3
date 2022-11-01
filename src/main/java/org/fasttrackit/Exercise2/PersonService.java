package org.fasttrackit.Exercise2;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PersonService {
    private Person person;


    public Person addPerson(Person person)  {

        if (person != null) {
            Person resultPerson = person;
            return resultPerson;
        } else {
            throw new RuntimeException("Obiectul Person care trebuie adaugat este null");
        }

    }


}

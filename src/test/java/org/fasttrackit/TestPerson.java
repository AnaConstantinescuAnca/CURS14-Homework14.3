package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.fasttrackit.Exercise2.Person;
import org.fasttrackit.Exercise2.PersonService;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class TestPerson {
    @Test
    public void instantiateClassPerson(){
        Person person = new Person();
    }

    @Test
    public void namePersonReturnNull(){
        String name = null;

        Person person = new Person(null, 20);

        Assertions.assertThat(person.getName()).isNull();
    }

    @Test
    public void personIsNull(){
        Person person = new Person();
        person = null;
        Assertions.assertThat(person).isNull();
    }

    @Test
    public void callAddPersonWithPersonNull (){
        PersonService personService = new PersonService();
        //Person person = null;

        Person person = personService.addPerson(null);

       // Assertions.assertThat(person).isNull();

    }

    @Test
    public void callAddPersonWithNotNullPerson (){
        PersonService personService = new PersonService();
        Person person = new Person("Ana", 20);

        personService.addPerson(person);

       Assertions.assertThat(person).isNotNull();
     }
}

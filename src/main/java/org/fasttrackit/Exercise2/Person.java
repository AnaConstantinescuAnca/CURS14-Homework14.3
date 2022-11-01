
package org.fasttrackit.Exercise2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private static final AtomicInteger count = new AtomicInteger(0);
    int id;
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.id = count.incrementAndGet();
    }

}

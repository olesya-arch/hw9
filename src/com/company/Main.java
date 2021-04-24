package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Person p1 = new Person("Sam", "Young", new Address("London", "Royal", 1));
        Person p2 = new Person("Tom", "Lee", new Address("Paris", "Herold", 27));
        Person p3 = new Person("Jack", "Fox", new Address("Rome", "Modena", 10));


            List<Person> persons = List.of(p1, p2, p3);
                    List<String> people = persons
                            .stream()
                             .map(Person::toString)
                          .collect(Collectors.toList());
                    people.forEach(System.out::println);


        System.out.println();

         PersonIOUtil.writePersons("text.txt", persons);


     try {
        PersonIOUtil.readPersons("text.txt").forEach(System.out::println);
     } catch (IOException e) {
         e.printStackTrace();
     } catch (EmptySourceFileException e) {
           e.printStackTrace();
     }

    }


    }


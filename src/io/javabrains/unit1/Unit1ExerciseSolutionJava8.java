package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create MethodReferenceExample2 method that prints all elements in the list
        printConditionally(people, p -> true);

        // Step 3: Create MethodReferenceExample2 method that prints all people that have last name beginning with C
        System.out.println("Print people with last name start with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        System.out.println("Print people with first name start with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Unit1ExerciseSolutionJava7.Condition condition) {
        for(Person p : people) {
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }

}

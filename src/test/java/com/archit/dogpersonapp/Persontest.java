package com.archit.dogpersonapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonConstructorWithoutDog() {
        Person person = new Person("John", 25);
        assertEquals("John", person.getName());
        assertEquals(25, person.getAge());
        assertTrue(person.getDog().isEmpty());
    }

    @Test
    void testPersonConstructorWithDog() {
        Dog dog = new Dog("Buddy", 5);
        Person person = new Person("John", 25, dog);
        assertEquals("John", person.getName());
        assertEquals(25, person.getAge());
        assertTrue(person.getDog().isPresent());
        assertEquals(dog, person.getDog().get());
    }

    @Test
    void testHasOldDog() {
        Dog youngDog = new Dog("Buddy", 5);
        Dog oldDog = new Dog("Max", 10);
        Person personWithYoungDog = new Person("Alice", 30, youngDog);
        Person personWithOldDog = new Person("Bob", 40, oldDog);
        Person personWithoutDog = new Person("Charlie", 35);
        
        assertFalse(personWithYoungDog.hasOldDog());
        assertTrue(personWithOldDog.hasOldDog());
        assertFalse(personWithoutDog.hasOldDog());
    }

    @Test
    void testChangeDogsNameWithDog() {
        Dog dog = new Dog("Buddy", 5);
        Person person = new Person("John", 25, dog);
        person.changeDogsName("Max");
        assertEquals("Max", person.getDog().get().getName());
    }

    @Test
    void testChangeDogsNameWithoutDog() {
        Person person = new Person("John", 25);
        Exception exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Max"));
        assertEquals("John does not own a dog!", exception.getMessage());
    }
}

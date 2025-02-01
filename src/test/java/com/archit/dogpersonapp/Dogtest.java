package com.archit.dogpersonapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testDogConstructorAndGetters() {
        Dog dog = new Dog("Buddy", 5);
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    void testSetName() {
        Dog dog = new Dog("Buddy", 5);
        dog.setName("Max");
        assertEquals("Max", dog.getName());
    }

    @Test
    void testSetAge() {
        Dog dog = new Dog("Buddy", 5);
        dog.setAge(7);
        assertEquals(7, dog.getAge());
    }

    @Test
    void testEqualsMethod() {
        Dog dog1 = new Dog("Buddy", 5);
        Dog dog2 = new Dog("Buddy", 5);
        Dog dog3 = new Dog("Max", 3);
        
        assertEquals(dog1, dog2);
        assertNotEquals(dog1, dog3);
    }
}


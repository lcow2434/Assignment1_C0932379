package com.archit.dogpersonapp;

public class Main {
    public static void main(String[] args) {
        Person personWithoutDog = new Person("John", 25);
        
        try {
            personWithoutDog.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
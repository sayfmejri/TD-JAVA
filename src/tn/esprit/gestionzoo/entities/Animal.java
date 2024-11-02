package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age); // Set age with validation
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new InvalidAgeException("L'âge d'un animal ne peut pas être négatif.");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal [Name=" + name + ", Age=" + age + "]";
    }
}

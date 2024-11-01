package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Dolphin extends Animal {
    private float swimmingSpeed;

    public Dolphin(String habitat, String name, int age, float swimmingSpeed) throws InvalidAgeException {
        super(name, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed=" + swimmingSpeed + " km/h";
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

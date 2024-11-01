package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Penguin extends Animal {
    private float swimmingDepth;

    public Penguin(String habitat, String name, int age, float swimmingDepth) throws InvalidAgeException {
        super(name, age);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth=" + swimmingDepth + " meters";
    }

    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

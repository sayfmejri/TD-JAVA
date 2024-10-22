package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, String name, int age, float swimmingDepth) {
        super(habitat, name, age);
        setSwimmingDepth(swimmingDepth);
    }

    public void setSwimmingDepth(float swimmingDepth) {
        if (swimmingDepth >= 0) {
            this.swimmingDepth = swimmingDepth;
        } else {
            throw new IllegalArgumentException("La profondeur de nage ne peut pas être négative.");
        }
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth=" + swimmingDepth + " meters";
    }
}

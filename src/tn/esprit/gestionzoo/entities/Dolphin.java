package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, String name, int age, float swimmingSpeed) {
        super(habitat, name, age);
        setSwimmingSpeed(swimmingSpeed);
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        if (swimmingSpeed >= 0) {
            this.swimmingSpeed = swimmingSpeed;
        } else {
            throw new IllegalArgumentException("La vitesse de nage ne peut pas être négative.");
        }
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed=" + swimmingSpeed + " km/h";
    }
}

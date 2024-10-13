package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        setSwimmingSpeed(swimmingSpeed);
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        if (swimmingSpeed >= 0) {
            this.swimmingSpeed = swimmingSpeed;
        } else {
            throw new IllegalArgumentException("La vitesse de nage ne peut pas être négative.");
        }
    }
    @Override
    public String toString() {
        return "Dolphin [Habitat=" + habitat + ", Swimming Speed=" + swimmingSpeed + " km/h]";
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}

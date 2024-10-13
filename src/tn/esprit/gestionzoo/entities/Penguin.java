package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        setSwimmingDepth(swimmingDepth);
    }

    public void setSwimmingDepth(float swimmingDepth) {
        if (swimmingDepth >= 0) {
            this.swimmingDepth = swimmingDepth;
        } else {
            throw new IllegalArgumentException("La profondeur de nage ne peut pas être négative.");
        }
    }
    @Override
    public String toString() {
        return "Penguin [Habitat=" + habitat + ", Swimming Depth=" + swimmingDepth + " meters]";
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

}

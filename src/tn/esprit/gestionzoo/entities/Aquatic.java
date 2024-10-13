package tn.esprit.gestionzoo.entities;

public class Aquatic {
    protected String habitat;

    public Aquatic(String habitat) {
        setHabitat(habitat);
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.trim().isEmpty()) {
            this.habitat = habitat;
        } else {
            throw new IllegalArgumentException("L'habitat ne peut pas être vide.");
        }
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}

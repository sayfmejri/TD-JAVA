package tn.esprit.gestionzoo.entities;

public abstract class Aquatic {
    protected String habitat;
    protected String name;
    protected int age;

    public Aquatic(String habitat, String name, int age) {
        setHabitat(habitat);
        this.name = name;
        this.age = age;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.trim().isEmpty()) {
            this.habitat = habitat;
        } else {
            throw new IllegalArgumentException("L'habitat ne peut pas être vide.");
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public abstract void swim(); // Méthode abstraite, à redéfinir dans les sous-classes

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;
        return habitat.equals(other.habitat) &&
                name.equalsIgnoreCase(other.name) &&
                age == other.age;
    }

    @Override
    public String toString() {
        return "Aquatic [Habitat=" + habitat + ", Name=" + name + ", Age=" + age + "]";
    }
}

package io.zipcoder.polymorphism;

public abstract class Pet implements Comparable<Pet> {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String speak();


    public int compareTo(Pet p) {
        if(this.name.equals(p.getName())) {
            return this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
        }

        return this.name.compareTo(p.name);
    }

}

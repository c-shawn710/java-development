package MiniExercise1.Animal_Hierarchy;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("nom nom");
    }

    public void breath() {
        System.out.println("breath in and out");
    }
}

package MiniExercise1.Animal_Hierarchy;

public class Main {
    public static void main(String[] args) {
        Flyable flyable1 = new Bird();
        Flyable flyable = new Eagle();
        flyable.fly();
        flyable1.fly();
        /*Eagle e = new Eagle();
        e.fly();*/
    }
}

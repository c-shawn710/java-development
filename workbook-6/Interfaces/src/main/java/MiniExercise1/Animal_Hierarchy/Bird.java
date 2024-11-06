package MiniExercise1.Animal_Hierarchy;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird is flying");
        System.out.println("Bird is singing");
    }
}

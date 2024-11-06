package MiniExercise2.Employee_Hierarchy;

public class Assistant extends PartTimeEmployee implements Promotable {
    public Assistant(String name, int age) {
        super(name, age);
    }

    @Override
    public void promote() {
        System.out.println("Assistant promoted to lead");
    }

    @Override
    public double getSalary() {
        return 0;
    }
}

package MiniExercise2.Employee_Hierarchy;

public class Manager extends FullTimeEmployee implements Promotable {
    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void promote() {
        System.out.println("Manager promoted to lead manager");
    }

    @Override
    public double getSalary() {

        return 60000;
    }
}

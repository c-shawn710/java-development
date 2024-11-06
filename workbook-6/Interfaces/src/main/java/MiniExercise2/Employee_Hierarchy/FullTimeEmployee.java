package MiniExercise2.Employee_Hierarchy;

public class FullTimeEmployee extends Employee implements Promotable {
    public FullTimeEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public void promote() {

    }

    @Override
    public double getSalary() {
        return 100000;
    }
}

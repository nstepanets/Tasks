package Task11;

public class Worker extends Employee {

    public Worker(int baseSalary, String name) {
        super(name, baseSalary);
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}

package Task11;

public abstract class Employee {

    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract int getSalary();

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
}

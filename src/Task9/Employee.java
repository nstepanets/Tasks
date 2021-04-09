package Task9;

public class Employee extends Person {
    int salary;

    public Employee(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.name);
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob", 25, 'M', 900);
        Employee employee2 = new Employee("Joe", 48, 'M', 2000);
        Employee employee3 = new Employee("Bob", 29, 'M', 1500);

        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.isSameName(employee3));
    }
}

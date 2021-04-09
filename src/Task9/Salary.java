package Task9;

public class Salary {

    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.salary;
        }
        return sum;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 30, 'M', 600);
        Employee employee2 = new Employee("Joe", 48, 'M', 4000);
        Employee employee3 = new Employee("Kate", 29, 'F', 1500);
        Employee[] employees = new Employee[] {employee1, employee2, employee3};

        System.out.println(getSum(employees));
    }
}

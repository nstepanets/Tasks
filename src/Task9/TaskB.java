package Task9;

public class TaskB {

    public static Employee findEmployeeByName(Employee[] employees, String name) {

        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee findEmployeeByPartialName(Employee[] employees, String name) {

        for (Employee employee : employees) {
            if (employee.name.contains(name)) {
                return employee;
            }
        }
        return null;
    }

    public static boolean isEmployeeInArray(Employee[] employeesArray, Employee employee) {

        for (Employee e : employeesArray) {
            if (e == employee) {
                return true;
            }
        }
        return false;
    }

    public static int findMinSalary(Employee[] employees) {
        int minSalary = employees[0].salary;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary < minSalary) {
                minSalary = employees[i].salary;
            }
        }
        return minSalary;
    }

    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].salary;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = employees[i].salary;
            }
        }
        return maxSalary;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30, 'M', 600);
        Employee employee2 = new Employee("Joe", 48, 'M', 4000);
        Employee employee3 = new Employee("Kate", 29, 'F', 1500);
        Employee employee4 = new Employee("Joe", 35, 'M', 3000);
        Employee[] companyTeam = new Employee[] {employee1, employee2, employee3};

        System.out.println(findEmployeeByName(companyTeam, "John"));
        System.out.println(findEmployeeByName(companyTeam, "Anna"));

        System.out.println(findEmployeeByPartialName(companyTeam, "Jo"));
        System.out.println(findEmployeeByPartialName(companyTeam, "Nat"));

        System.out.println(isEmployeeInArray(companyTeam, employee1));
        System.out.println(isEmployeeInArray(companyTeam, employee4));

        System.out.println(findMinSalary(companyTeam));

        System.out.println(findMaxSalary(companyTeam));
    }
}

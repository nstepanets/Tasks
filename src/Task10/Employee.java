package Task10;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private int dailySalary;

    public Employee(String name, int age, char gender, int dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (Month month: monthArray) {
            salary += dailySalary * month.workDays;
        }
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }
}

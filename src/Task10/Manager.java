package Task10;

public class Manager extends Employee{

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (Month month: monthArray) {
            salary += getDailySalary() * month.workDays;
        }
        salary += salary * numberOfSubordinates / 100;
        return salary;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}

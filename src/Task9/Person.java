package Task9;

public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (gender == 'M') {
            return "Mr. " + name;
        } else if (gender == 'F') {
            return "Mrs. " + name;
        } else {
            return name;
        }
    }

    public static void main(String[] args) {

        Person john = new Person("John", 32, 'M');
        Person kate = new Person("Kate", 28, 'F');

        System.out.println(john.getName());
        System.out.println(kate.getName());
    }
}

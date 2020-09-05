package geekbrains.ru_java_lesson_5_OOP;

public class Workman {
    private String name;
    private String profession;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }
    public Workman(String name, String email, int age, int phoneNumber, int salary, String profession) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.profession = profession;
    }
    public void printInfo(){
        System.out.println("\nФИО " + name + "\n email " + email +"\n age "+ age + "\n phone " + phoneNumber + "\n salary " + salary + "\n profession " + profession);

    }
}


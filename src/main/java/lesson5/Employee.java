package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String name, String position, String email,String phoneNum, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPosition: %s\nE-mail: %s\nPhone: %s\nSalary: %d\nAge: %d\n", name, position, email, phoneNum, salary, age);
    }
// Создание массива в классе ====Homework====.

}

package lesson5;

public class Homework {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Java developer", "java_rules@mail.ru", "88005553535", 2000, 55);
        employees[1] = new Employee("Petrov Petr", "Kotlin developer", "kotlin_rules@mail.ru", "81234568790", 500, 30);
        employees[2] = new Employee("Sidorov Sidor", "Pascal developer", "what_is_it@mail.ru", "02", 1500, 80);
        employees[3] = new Employee("Grigoriev Grigorii", "Unity developer", "woohooo@gmail.com", "84950000000", 2500, 45);
        employees[4] = new Employee("Vladimirov Vladimir", "Swift developer", "i_slomal@icloud.com", "87777777777", 5500, 60);

        printAdults(employees);
    }

    private static void printAdults(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 40){
                employee.printInfo();
            } else {
                System.out.println(employee.getName() + " is too young to be printed!");
                System.out.println();
            }
        }
    }
}

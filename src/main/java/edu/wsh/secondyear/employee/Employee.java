package edu.wsh.secondyear.employee;

public class Employee {
    String name;

    int age;
    String department;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println(new Employee(getName(),getAge(),getDepartment(),getSalary()));
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne", 33);
        Employee empThree = new Employee("Jan Kowalski", 44, "Testy");
        empOne.setAge(26);
        empOne.setDepartment("Development");
        empOne.setSalary(1000);
        empOne.printEmployee();
        empTwo.setDepartment("Software");
        empTwo.setSalary(500);
        empTwo.printEmployee();
        empThree.salary = 1500;
        empThree.printEmployee();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

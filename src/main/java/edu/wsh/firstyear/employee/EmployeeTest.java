package edu.wsh.firstyear.employee;

public class EmployeeTest {

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
}

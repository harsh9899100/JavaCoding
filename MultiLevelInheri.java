class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class MultiLevelInheri {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Karan Prajapati";
        employee.age = 21;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Ahmedabad";
        employee.salary = 5000000.0;
        employee.specialization = "Data Science";

        //For Manager------------------------
        Manager manager = new Manager();
        manager.name = "Harsh Patel";
        manager.age = 21;
        manager.phoneNumber = "9876543210";
        manager.address = "456 LA";
        manager.salary = 800000000.0;
        manager.specialization = "Project Management";
        manager.department = "IT";

        //Print all Employee Data--------------------------------
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("------------------------------------");

        //Print all Manager Data--------------------------------
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Specialization: " + manager.specialization);
        System.out.println("Department: " + manager.department);

        
    }
}

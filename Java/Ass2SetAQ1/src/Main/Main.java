package Main;
class Employee {
    int id;
    String name;

    public Employee() {
        id = 0;
        name = "";
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Manager extends Employee {
    String dept;
    double salary;

    public Manager() {
        super();
        dept = "";
        salary = 0.0;
    }

    public Manager(int id, String name, String dept, double salary) {
        super(id, name);
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + ", Department: " + dept + ", Salary: " + salary;
    }
}

class SalesManager extends Manager {
    double bonus;

    public SalesManager() {
        super();
        bonus = 0.0;
    }

    public SalesManager(int id, String name, String dept, double salary, double bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "John", "IT", 50000.0);
        SalesManager salesManager = new SalesManager(2, "Jane", "Sales", 60000.0, 10000.0);

        System.out.println(manager.toString() + ", Salary: " + manager.getSalary());
        System.out.println(salesManager.toString() + ", Salary: " + salesManager.getSalary());
    }
}



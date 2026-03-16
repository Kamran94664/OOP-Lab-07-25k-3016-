class Employee {
    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        int salary = 80000;
        System.out.println("Manager Salary: " + salary);
    }
}

class Developer extends Employee {
    void calculateSalary() {
        int salary = 60000;
        System.out.println("Developer Salary: " + salary);
    }
}

class Intern extends Employee {
    void calculateSalary() {
        int salary = 20000;
        System.out.println("Intern Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee e;

        e = new Manager();
        e.calculateSalary();
        e = new Developer();
        e.calculateSalary();
        e = new Intern();
        e.calculateSalary();
    }
}
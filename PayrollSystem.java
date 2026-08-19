class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Instance method: calculates bonus for a particular employee
    double calculateBonus() {
        return salary * 0.10;   // 10% bonus
    }

    // Static method: same tax slab for all employees
    static double calculateTaxSlab(double salary) {
        if (salary <= 300000) {
            return 0;
        } else if (salary <= 600000) {
            return 5;
        } else if (salary <= 1000000) {
            return 10;
        } else {
            return 20;
        }
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Bonus: Rs. " + calculateBonus());
        System.out.println("Tax Slab: " + calculateTaxSlab(salary) + "%");
        System.out.println();
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Rahul", 500000);
        Employee emp2 = new Employee(102, "Amit", 800000);

        emp1.display();
        emp2.display();

        // Static method can also be called using the class name
        System.out.println("Tax slab for Rs. 1200000: "
                + Employee.calculateTaxSlab(1200000) + "%");
    }
}

class Employee {
   void displayRole(){
        System.out.println("Role:Employee");
    }
}
    class Developer extends Employee {
       void displayRole(){
            System.out.println("Role:Developer");
        }
    }
        class Manager extends Employee {
           void displayRole(){
                System.out.println("Role:Manager");
            }

        }
        public class Main {
    public static void main(String[] args) {

        Employee employee;

        employee = new Developer();
        employee.displayRole();

        employee = new Manager();
        employee.displayRole();
    }
}


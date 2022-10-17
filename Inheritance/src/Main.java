public class Main {
    public static void main(String[] args) {
     Customer customer=new Customer();
     Emloyee emloyee=new Emloyee();
     EmployeeManager employeeManager=new EmployeeManager();
     CustomerManager customerManager=new CustomerManager();
     employeeManager.bestEmployee();
     customerManager.add();
    }
}
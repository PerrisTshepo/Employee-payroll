import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddEmployee {

  public static void addEmployee(ArrayList<Employee> employees, Scanner scanner) {

    try {

      System.out.println("===== Add Employee =====");

      System.out.println("1. Developer");
      System.out.println("2. Manager");
      System.out.println("3. Intern");

      System.out.print("Choose employee type: ");
      int type = scanner.nextInt();

      System.out.print("Enter Employee ID: ");
      int id = scanner.nextInt();

      // Check for duplicate ID
      for (Employee emp : employees) {
        if (emp.getEmployeeId() == id) {
          System.out.println("Employee ID already exists.");
          return;
        }
      }

      scanner.nextLine();

      System.out.print("Enter Employee Name: ");
      String name = scanner.nextLine();

      System.out.print("Enter Base Salary: ");
      double baseSalary = scanner.nextDouble();

      if (baseSalary < 0) {
        System.out.println("Salary cannot be negative.");
        return;
      }

      Employee employee;

      switch (type) {

        case 1:

          System.out.print("Enter Bonus: ");
          double devBonus = scanner.nextDouble();

          employee = new Developer(id, name, baseSalary, devBonus);
          break;

        case 2:

          System.out.print("Enter Bonus: ");
          double managerBonus = scanner.nextDouble();

          System.out.print("Enter Allowance: ");
          double allowance = scanner.nextDouble();

          employee = new Manager(id, name, baseSalary, managerBonus, allowance);
          break;

        case 3:

          employee = new Intern(id, name, baseSalary);
          break;

        default:

          System.out.println("Invalid employee type.");
          return;
      }

      employees.add(employee);

      System.out.println("Employee added successfully!");

    } catch (InputMismatchException e) {

      System.out.println("Invalid input.");

      scanner.nextLine();

    }

  }

}

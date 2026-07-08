import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);
  public static ArrayList<Employee> employees = new ArrayList<>();

  public static void main(String[] args) {

    int choice;

    do {

      System.out.println("1. Add Employee");


      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {

        case 1:
          AddEmployee.addEmployee(employees, scanner);
          break;

        case 2:
          break;

        case 3:
          break;

        case 4:
          break;

        case 5:
          break;

        case 6:
          System.out.println("Goodbye!");
          break;

        default:
          System.out.println("Invalid choice.");
      }
1
    } while (choice != 6);

  }
}

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveEmployee {

    public static void removeEmployee(ArrayList<Employee> employees, Scanner scanner) {

        try {

            if (employees.isEmpty()) {
                System.out.println("No employees available to remove.");
                return;
            }

            System.out.println("===== Remove Employee =====");

            System.out.print("Enter Employee ID to remove: ");
            int id = scanner.nextInt();

            Employee employeeToRemove = null;

            // Search for the employee by ID
            for (Employee emp : employees) {
                if (emp.getEmployeeId() == id) {
                    employeeToRemove = emp;
                    break;
                }
            }

            if (employeeToRemove != null) {
                employees.remove(employeeToRemove);
                System.out.println("Employee removed successfully!");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (InputMismatchException e) {

            System.out.println("Invalid input.");

            scanner.nextLine();
        }
    }
}

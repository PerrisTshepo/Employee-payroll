import java.util.ArrayList;

public class ViewEmployees {

    public static void viewEmployees(ArrayList<Employee> employees) {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n===== EMPLOYEE LIST =====");

        for (Employee employee : employees) {

            employee.displayDetails();
            System.out.println("-------------------------");

        }

    }

}
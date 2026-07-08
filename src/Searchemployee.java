import java.util.ArrayList;
import java.util.Scanner;

public class Searchemployee {

    public static void searchemployee(ArrayList<Employee> employees) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID to search: ");
        int searchId = input.nextInt();

        boolean found = false;

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == searchId) {

                System.out.println("\n===== Employee Found =====");
                employee.displayDetails();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
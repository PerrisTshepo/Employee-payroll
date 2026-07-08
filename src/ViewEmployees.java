public static void ViewEmployees(ArrayList<Employee> employees) {

    if (employees.isEmpty()) {
        System.out.println("\nNo employees found.");
        return;
    }

    System.out.println("\n===== EMPLOYEE LIST =====");

    for (Employee employee : employees) {
        employee.displayDetails();
        System.out.println("----------------------------");
    }
}

void main() {
}


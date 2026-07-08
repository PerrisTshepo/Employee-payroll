public class Intern extends Employee {

    public Intern(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: Intern");
        System.out.println("Total Salary: R" + calculateSalary());
    }
}
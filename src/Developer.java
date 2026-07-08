public class Developer extends Employee {

    private double bonus;

    public Developer(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: Developer");
        System.out.println("Bonus: R" + bonus);
        System.out.println("Total Salary: R" + calculateSalary());
    }
}
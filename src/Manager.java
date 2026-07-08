public class Manager extends Employee {

    private double bonus;
    private double allowance;

    public Manager(int employeeId, String name, double baseSalary,
                   double bonus, double allowance) {

        super(employeeId, name, baseSalary);
        this.bonus = bonus;
        this.allowance = allowance;
    }

    public double getBonus() {
        return bonus;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus + allowance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: Manager");
        System.out.println("Bonus: R" + bonus);
        System.out.println("Allowance: R" + allowance);
        System.out.println("Total Salary: R" + calculateSalary());
    }
}
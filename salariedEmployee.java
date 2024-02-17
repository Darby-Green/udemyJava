public class salariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public salariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double getPay() {
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }
    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}

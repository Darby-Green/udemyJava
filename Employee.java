public abstract class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate, 77001, "01/01/2020");
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                " " + super.toString();
    }

    public double getPay() {
        return 0;
    }
}
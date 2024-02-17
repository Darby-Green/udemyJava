public class BankSys {
    private String accNo;
    private double accBal;
    private String accName;
    private String accEmail;
    private String accPhone;

    public BankSys() {
        this("56789", 2.50, "Default Name", "Default Adress",
                "Default Phone");
        System.out.println("Empty constructor called!!");
    }
    public BankSys(String accNo, double accBal, String accName, String accEmail,
                   String accPhone) {
        System.out.println("Account constructors with parameters called!!");
        this.accNo = accNo;
        this.accBal = accBal;
        this.accName = accName;
        this.accEmail = accEmail;
        this.accPhone = accPhone;
    }
    public void depositFunds(double depositAmount) {
        accBal += depositAmount;
        System.out.println("Deposit amount: " + depositAmount + "Current balance: " + accBal);
    }
    public void withdrawFunds(double withdrawAmount) {
        if (accBal - withdrawAmount < 0) {
            System.out.println("Insufficient funds, you only have " + accBal + " in your account!!");
        } else {
            accBal -= withdrawAmount;
            System.out.println("Withdraw amount: " + withdrawAmount + "Current balance: " + accBal);
        }
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccEmail(String accEmail) {
        this.accEmail = accEmail;
    }

    public void setAccPhone(String accPhone) {
        this.accPhone = accPhone;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getAccBal() {
        return accBal;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccEmail() {
        return accEmail;
    }

    public String getAccPhone() {
        return accPhone;
    }

    public static void main(String[] args) {

    }
}

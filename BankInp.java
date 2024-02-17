public class BankInp {
    public static void main(String[] args) {
        BankSys dankAccount = new BankSys("12345", 1000.0,
                "Bob Brown", "myEmail@bob.net", "555-4567");
        System.out.println(dankAccount.getAccNo());
        System.out.println(dankAccount.getAccBal());
        dankAccount.depositFunds(2000);
        dankAccount.withdrawFunds(100.4);
    }
}

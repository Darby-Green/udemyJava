public class Inheratance_Mk1 {
    public static void main(String[] args) {
        Employee Darby = new Employee("Darby", "1/31/1985",
                77001, "01/01/2020") {};
        System.out.println(Darby);
        System.out.println("Age= " + Darby.getAge());
        System.out.println("Pay= " + Darby.collectPay());

        salariedEmployee Dank = new salariedEmployee("Dank", "11/11/1990", 4532, "11/11/2020",
                35000);
        System.out.println(Dank);
        System.out.println("Dank's pay= $" + Dank.getPay());
        Dank.retire();
        System.out.println("Dank's pension check= $" + Dank.getPay());
    }
}

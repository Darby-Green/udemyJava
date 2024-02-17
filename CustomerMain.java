public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Darby", 1000.34,"dgreen02@dank.edu");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());
    }
}

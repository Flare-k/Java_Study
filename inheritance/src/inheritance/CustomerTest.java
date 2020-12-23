package inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerID(1001);
        customerLee.setCustomerName("Lee");

        VIPCustomer customerKang = new VIPCustomer();
        customerKang.setCustomerID(1002);
        customerKang.setCustomerName("Kang");

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKang.showCustomerInfo());
    }

}

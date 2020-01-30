import java.util.ArrayList;

public class Store {
    public static final int MAX_CUSTOMERS = 500;
    private String name;
    private Customer[] customers;
    private int customerCount;
    private static int LATEST_ID = 100000;

    public Store(String n) {
        name = n;
        customers = new Customer[MAX_CUSTOMERS];
        customerCount = 0;
    }
    public void addCustomer(Customer c) {
        c.setID(LATEST_ID++);
        if (customerCount < MAX_CUSTOMERS)
            customers[customerCount++] = c;
    }
    public void listCustomers() {
        for (int i = 0; i < customerCount; i++)
            System.out.println(customers[i]);
    }
    public int averageCustomerAge() {
        int sumAge = 0;
        for (int i = 0; i < customerCount; i++) {
            sumAge += customers[i].getAge();
        }
        return sumAge / customerCount;
    }
    public Customer richestCustomer() {
        Customer richestCustomer = customers[0];
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].hasMoreMoneyThan(richestCustomer)) {
                richestCustomer = customers[i];
            }
        }
        return richestCustomer;
    }
    public Customer[] getCustomers() {
        return customers;
    }
    public int getCustomerCount() {
        return customerCount;
    }
    public String getStoreName() {
        return name;
    }
    public Customer[] friendsFor(Customer lonelyCustomer) {
        //ArrayList<Customer> friends = new ArrayList<Customer>();
        Customer[] friends = new Customer[customerCount];
        int LOWER_LIMIT = lonelyCustomer.getAge() - 3;
        int UPPER_LIMIT = lonelyCustomer.getAge() + 3;
        Customer customer;
        int i = 0;
        for (Customer c: customers) {
            if (c != null && !c.equals(lonelyCustomer) && c.getAge() <= UPPER_LIMIT && c.getAge() >= LOWER_LIMIT) {
                friends[i] = c;
                i++;
            }
        }
        return friends;
    }


}
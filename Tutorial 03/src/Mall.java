import java.util.ArrayList;

public class Mall {
    public static final int MAX_STORES = 100;
    private String name;
    private Store[] stores;
    private int storeCount;

    public Mall(String n) {
        name = n;
        stores = new Store[MAX_STORES];
        storeCount = 0;
    }
    public void addStore(Store s) {
        if (storeCount < MAX_STORES) {
            stores[storeCount++] = s;
        }
    }
    public boolean shoppedAtSameStore(Customer c1, Customer c2) {
        Store store;
        Customer[] customers;
        boolean c1Shopped, c2Shopped;
        for (int i = 0; i < storeCount; i++) {
            c1Shopped = false;
            c2Shopped = false;
            store = stores[i];
            customers = store.getCustomers();
            for (int j = 0; j < store.getCustomerCount(); j++) {
                if (customers[j].equals(c1)) {
                    c1Shopped = true;
                }
                if (customers[j].equals(c2)) {
                    c2Shopped = true;
                }
                if (c1Shopped && c2Shopped) {
                    return true;
                }
            }
        }
        return false;
    }
    public int getUniqueCustomerCount() {
        Store store;
        Customer customer;
        ArrayList<Customer> uniqueCustomers = new ArrayList<Customer>();
        for (int i = 0; i < storeCount; i++) {
            store = stores[i];
            for (int j = 0; j < store.getCustomerCount(); j++) {
                customer = store.getCustomers()[j];
                if (!uniqueCustomers.contains(customer)) {
                    uniqueCustomers.add(customer);
                }
            }
        }
        return uniqueCustomers.size();
    }
}

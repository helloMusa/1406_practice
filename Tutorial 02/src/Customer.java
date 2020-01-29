public class Customer {
    String name;
    int age;
    float money;
    boolean admitted;

    public Customer(String name) {
        this.name = name;
        age = 0;
        money = 0.0f;
        admitted = false;

    }
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        money = 0.0f;
        admitted = false;
    }
    public Customer(String name, int age, float money){
        this.name = name;
        this.age = age;
        this.money = money;
        admitted = false;
    }
    public Customer() {
        name = "Name";
        age = 0;
        money = 0.0f;
        admitted = false;
    }
    public String toString() {
        String admission = admitted ? "" : " not";
        return String.format("Customer %s: a %d year old with $%.2f who has%s been admitted", name, age, money, admission);
    }
    public float computeFee() {
        if (age >= 65) {
            return .5f * 12.75f;
        }
        else if (age >= 18) {
            return 12.75f;
        }
        else if (age >= 4 && age <= 17) {
            return 8.50f;
        }
        else {
            return 0f;
        }
    }
    public boolean spend(float amount) {
        if (amount >= 0 && money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }
    public boolean hasMoreMoneyThan(Customer c) {
        if (money > c.money) {
            return true;
        }
        return false;
    }
    public void payAdmission() {
        admitted = spend(computeFee());
    }
}

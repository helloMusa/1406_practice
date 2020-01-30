public class Customer {
    private String name;
    private int age;
    private float money;
    private int id;

    public Customer(String n, int a, float m) {
        name = n;
        age = a;
        money = m;
        id = -1;
    }

    public String toString() {
        return "Customer " + name + "(" + id + ")" + ": a " + age + " year old with $" + money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public boolean hasMoreMoneyThan(Customer c) {
        return this.money > c.money;
    }



}

public class CustomerTestProgram {
    public static void main(String[] args) {
        Customer c;

        c = new Customer();
        c.name = "Musa";
        c.age = 19;
        c.money = 100;
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.money);
    }
}

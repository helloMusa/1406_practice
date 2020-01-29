public class CustomerConstructorTestProgram {
    public static void main(String[] args) {
        Customer c1, c2, c3, c4;

        c1 = new Customer("Bob", 17);
        c2 = new Customer("Dottie", 3, 10);
        c3 = new Customer("Jane");
        c4 = new Customer();

        System.out.printf("Bobby: %s, %d, %.2f\n", c1.name, c1.age, c1.money);
        System.out.printf("Dottie: %s, %d, %.2f\n", c2.name, c2.age, c2.money);
        System.out.printf("Jane: %s, %d, %.2f\n", c3.name, c3.age, c3.money);
        System.out.printf("Customer 4: %s, %d, %.2f\n", c4.name, c4.age, c4.money);

        System.out.println("Bob's fee: $" + c1.computeFee());
        System.out.println("Dottie's fee: $" + c2.computeFee());
        c3.age = 23;
        System.out.println("Jane's fee: $" + c3.computeFee());
        c4.age = 65;
        System.out.println("C4's fee: $" + c4.computeFee());

        c2.spend(-80);
        System.out.println("Dottie's remaining money is $" + c2.money);
    }
}

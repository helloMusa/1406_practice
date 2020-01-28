import java.util.Scanner;

public class TaxProgram {
    public static void main(String[] args) {
        double income, fedTax, provTax, deductions, totalTax;
        int dependents;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your taxable income: ");
        income = input.nextDouble();

        System.out.println("Please enter your number of dependents");
        dependents = input.nextInt();

        fedTax = 0.0;
        provTax = 0.0;

        // Compute federal tax
        if (income <= 29590){
            fedTax = 0.17 * income;
        }
        else if (income > 29590.01 && income < 59179.99){
            fedTax = 0.17 * 29590 + (0.26 * (income - 29590));
        }
        else {
            fedTax = 0.17 * 29590 + (0.26 * 29590) + (0.29 * (income - 59180));
        }

        // Compute provincial tax
        provTax = 0.425 * fedTax;
        deductions = 160.50 + (328 * dependents);
        provTax -= deductions;

        // Compute total tax
        totalTax = fedTax + provTax;

        System.out.println("Here is your tax breakdown: ");
        System.out.println(String.format("%-20s$%,.2f", "Income", income));
        System.out.println(String.format("Dependents                   %d", dependents));
        System.out.println("------------------------------");
        System.out.println(String.format("%-20s$%,.2f", "Federal Tax", fedTax));
        System.out.println(String.format("%-20s$%,.2f", "Provincial Tax", provTax));
        System.out.println("==============================");
        System.out.println(String.format("%-20s$%,.2f", "Total Tax", totalTax));
    }
}
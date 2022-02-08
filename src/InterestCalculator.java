import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        double rate = 1.0;
        int month = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        rate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(rate/100)/12*month;
        }
        System.out.printf("Total Of Interest: %.2f", totalInterest);
    }
}

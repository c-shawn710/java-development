import java.util.Scanner;

public class PV_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your monthly payout: ");
        double payout = scanner.nextDouble();

        System.out.println("Please enter your interest rate: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Please enter years to payout: ");
        int years = scanner.nextInt();

        double monthlyIntRate = (annualRate / 100) / 12;
        double finalIntRate = monthlyIntRate + 1;
        finalIntRate = (1 - ((Math.pow(finalIntRate, -12*years))));
        finalIntRate = payout * (finalIntRate / monthlyIntRate);

        System.out.println("You would need to invest: $" + finalIntRate);
    }
}
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = input.nextDouble();
            sum += number;
        }

        double average = sum / n;

        System.out.println("The average is: " + average);

        input.close();
    }
}

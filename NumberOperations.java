import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        double largest = Math.max(num1, Math.max(num2, num3));
        //double sum = num1 + num2 + num3;
       // double average = sum / 3;

        System.out.println("The sum of the largest number is: " + largest);
       // System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}

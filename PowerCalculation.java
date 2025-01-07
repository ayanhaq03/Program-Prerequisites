import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base (b): ");
        int b = sc.nextInt();
        System.out.print("Enter Exponent (e): ");
        int e = sc.nextInt();

        double result = Math.pow(b, e);
        System.out.println("Result: " + result);
    }
}

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number (c): ");
        int c = sc.nextInt();

        float avg = (a + b + c) / 3.0f;
        System.out.println("Average: " + avg);
    }
}

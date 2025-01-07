import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (p): ");
        float p = sc.nextFloat();
        System.out.print("Enter Rate (r): ");
        float r = sc.nextFloat();
        System.out.print("Enter Time (t): ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

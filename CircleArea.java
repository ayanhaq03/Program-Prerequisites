import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius (r): ");
        float r = sc.nextFloat();

        double area = Math.PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
}

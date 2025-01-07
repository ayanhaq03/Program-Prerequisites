import java.util.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length (l): ");
        int l = sc.nextInt();
        System.out.print("Enter Width (w): ");
        int w = sc.nextInt();

        int p = 2 * (l + w);
        System.out.println("Perimeter: " + p);
    }
}

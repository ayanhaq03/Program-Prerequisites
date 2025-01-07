import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius (r): ");
        float r = sc.nextFloat();
        System.out.print("Enter Height (h): ");
        float h = sc.nextFloat();

        double volume = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        float c = sc.nextFloat();

        float f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}

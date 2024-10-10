// 12S24028 - Rotua Immanuela Tampubolon
// 12S24002 - Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double total, total1, price, small;

        small = 999.99;
        total = 0;
        price = Double.parseDouble(input.nextLine());
        while (price != 0) {
            if (price < small) {
                small = price;
                total = total + small;
            } else {
                price = price;
                total = total + price;
            }
            price = Double.parseDouble(input.nextLine());
        }
        if (total >= 100.0) {
            total1 = total - small;
        } else {
            total1 = total;
        }
        System.out.println(toFixed(total1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

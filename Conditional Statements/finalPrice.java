import java.util.*;

public class finalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        char discount = sc.next().charAt(0);
        float value = sc.nextFloat();
        
        
        if(discount == 'F'){
            System.out.printf("Discount Amount: Rs.%.2f%n", value);
            double finalPrice = price - value;
            System.out.println("Final Price: Rs." + finalPrice);
        } else if(discount == 'P'){
            System.out.printf("Discount Percentage: %.2f%n", value);
            double per = price - (price * value / 100);
            System.out.printf("Final Price: Rs.%.2f%n", per);
        } else {
            System.out.println("Invalid discount type");
        }

        sc.close();
    }
}

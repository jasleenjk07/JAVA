import java.util.*;

public class lineSegment {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int choice = sc.nextInt();
     
     if(choice == 1){
         double x1 = sc.nextDouble();
         double y1 = sc.nextDouble();
         double x2 = sc.nextDouble();
         double y2 = sc.nextDouble();
         double slope = (y2-y1)/(x2-x1);
         System.out.printf("Slope: %.1f%n", slope);
     } else if (choice == 2){
         double x1 = sc.nextDouble();
         double y1 = sc.nextDouble();
         double x2 = sc.nextDouble();
         double y2 = sc.nextDouble();
         double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
         System.out.printf("Distance: %.2f%n", distance);
     } else if (choice == 3){
         double x1 = sc.nextDouble();
         double y1 = sc.nextDouble();
         double x2 = sc.nextDouble();
         double y2 = sc.nextDouble();
         double midpointX = (x1+x2)/2.0;
         double midpointY = (y1+y2)/2.0;
         System.out.printf("Midpoint: (%.1f, %.1f)%n", midpointX, midpointY);
     } else {
         System.out.println("Invalid choice. Please select a valid option.");
     }

     sc.close();
 }
}


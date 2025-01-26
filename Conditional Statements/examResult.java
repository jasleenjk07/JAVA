import java.util.*;

public class examResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int choice = sc.nextInt();
        
        if(choice == 1){
            double avg = (sub1 + sub2 + sub3)/3.0;
            System.out.printf("Average Marks: %.1f%n", avg);
        } else if(choice == 2){
            double highest = Math.max(sub1,Math.max(sub2,sub3));
            System.out.println("Highest Marks: " + highest);
        } else if(choice == 3){
            double lowest = Math.min(sub1,Math.min(sub2,sub3));
            System.out.println("Lowest Marks: " + lowest);
        } else {
            System.out.println("Invalid choice");
        }
        
        sc.close();
    }
}

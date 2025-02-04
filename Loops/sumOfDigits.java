// You are using Java
import java.util.*;

public class sumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int temp = N;
        int sum = 0;
        int count = 0;
        
        do{
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
            count++;
        } while(temp > 0);
        
        if(count == sum){
            System.out.println("The number of digits in " + N + " matches the sum of its digits.");
        } else {
            System.out.println("The number of digits in " + N + " does not match the sum of its digits.");
        }
        sc.close();
    }
}
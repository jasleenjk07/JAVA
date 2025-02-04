// You are using Java
import java.util.*;

public class oddSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int temp = N;
        int oddSum = 0;
        
        while(temp > 0){
            int digit = temp % 10;
            if(digit % 2 != 0){
                oddSum += digit * digit;
            }
            temp /= 10;
        }
        System.out.println(oddSum);
        sc.close();
    }
}
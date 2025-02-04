import java.util.*;

public class oddProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int product = 1;
        
        for(int i = 0; i < arr.length; i++){
            if((i+1) % 2 != 0){
                product *= arr[i];    
            }
        }
        System.out.println(product);
        sc.close();
    }
}

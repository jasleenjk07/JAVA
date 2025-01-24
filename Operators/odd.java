import java.util.*;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Boolean odd = n % 2 != 0;
        
        System.out.println("Is the integer odd? " + odd);

        sc.close();
    }
}

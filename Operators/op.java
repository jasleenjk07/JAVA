import java.util.*;

public class op {
    public static void main(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int result = (a + b - c * d/a) % b;
        
        System.out.println("(a + b - c * d / a) % b = " + result);

        sc.close();
}
}



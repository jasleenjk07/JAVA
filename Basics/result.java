import java.util.*;

class result{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        char character = sc.next().charAt(0);
        
        System.out.println("Integer Value: " + value);
        System.out.println("Character Value: " + character);
        sc.close();
    }
}
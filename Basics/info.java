import java.util.*;

public class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String status = sc.nextLine();
        int model = sc.nextInt();
        
        System.out.println("Device Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Model Number: " + model);
        sc.close();
    }
}



import java.util.*;

public class Equation {
    private double a,b,c;

    public void inputCoefficients(Scanner sc){
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }

    public void solveEquation(){
        if(a == 0.0){
            System.out.println("a is zero");
        } else {
            double x = (c-b)/a;
            System.out.printf("x = %.1f%n",x);
        }

        if(b == 0.0){
            System.out.println("b is zero");
        } else {
            double y = (c-a)/b;
            System.out.printf("y = %.1f%n",y);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Equation eq = new Equation();
        eq.inputCoefficients(sc);
        eq.solveEquation();
        sc.close();
    }
}

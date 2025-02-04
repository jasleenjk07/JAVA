// You are using Java
import java.util.*;

enum GameLevel{
    EASY, MEDIUM, HARD
}

public class level{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        
        if(S >= 0 && S <= 50){
            GameLevel easy = GameLevel.EASY;
            System.out.println(easy);
        } else if (S > 50 && S <= 75){
            GameLevel medium = GameLevel.MEDIUM;
            System.out.println(medium);
        } else {
            GameLevel hard = GameLevel.HARD;
            System.out.println(hard);
        }
        sc.close();
    }
}

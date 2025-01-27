import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if((N % 4 == 0 && N % 100 != 0) || (N % 400 == 0)){
            System.out.println(N + " is a Leap Year");
        } else {
            System.out.println(N + " is not a Leap Year");
        }
        sc.close();
    }
}

//Ravi is preparing a lecture on significant events that occurred during leap years. To ensure his content is accurate, he needs a program that can check if a given year is a leap year. 



//Help Ravi by writing a program that takes a year as input and determines whether it is a leap year or not.

//Input format :
//The input consists of an integer N, representing the year.

//Output format :
//The output prints "[N] is a Leap Year" if the entered year is a leap year.

//Otherwise, print "[N] is not a Leap Year" if the entered year is not a leap year.



//Refer to the sample output for formatting specifications.

//Code constraints :
//In this scenario, the test cases fall under the following constraints:

//1990 ≤ N ≤ 2100

//Sample test cases :
//Input 1 :
//2000
//Output 1 :
//2000 is a Leap Year
//Input 2 :
//2023
//Output 2 :
//2023 is not a Leap Year

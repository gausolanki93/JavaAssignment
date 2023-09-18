// Write a program to check +ve, -ve, zero.
import java.util.*;

public class Q15 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        if(num ==0){
            System.out.println(num +" Is Zero");
        }
        else if(num<0){
            System.out.println(num +" Is Negative Number");
        }

        else{
            System.out.println(num +" Is Positive Number");
        }
    }
}

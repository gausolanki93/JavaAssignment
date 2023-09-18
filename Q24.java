// Write a program to calculate sum of n natural numbers.
import java.util.*;
public class Q24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = n-1; i>0 ; i--){
            n = n+i;
        }
        System.out.println(n);
    }
}

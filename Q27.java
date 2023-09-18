import java.util.*;
public class Q27 {
    public static void main (String[] args){
        int p,r,n,si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P : ");
        p = sc.nextInt();
        System.out.println("Enter N : ");
        n = sc.nextInt();

        for(int i=1;i<=10;i++){
            r = i;
            si = (p*r*n)/100;
            System.out.println("The Simple Interest is Rate = "+r+" Is : "+si);
            
        }
        


    }
}

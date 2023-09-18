// Write a program to print 1-10 skipping 7 and 8 using continue
public class Q28{

    public static void main (String[] args){
        for(int i=1;i<=10;i++){
            if(i==7){
                continue;
            }
            else if(i==8){
                continue;
            }
            else{
                System.out.println(i);
            }
        }

    }


}

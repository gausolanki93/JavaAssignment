public class Q30 {
    public static void main (String[] args){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==2){
                    if(j==2 ||j==3){
                        continue;
                    }
                    else{
                     System.out.println(i + " " + j);
                    }
                }
                else{
                    System.out.println(i + " " + j);
                }
                

            }
               
        }
    }
}


// 1 1
// 1 2
// 1 3
// 2 1
// 3 1
// 3 2
// 3 3
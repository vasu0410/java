import java.net.SocketTimeoutException;
import java.util.*;
public class pattern_test{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N+1;j++){
                if (j<=1 && i!=N)
                {
                    if(i==1)
                    {
                    System.out.print("*");
                    }
                    else if (i<N)
                    {
                        System.out.print("*");
                        for(int k=1;k<i;k++){
                        System.out.print("^");
                        }
                        System.out.print("*");  
                    }
                    break;
                }
            else{
                    System.out.print("*");
                }
           
            }
            System.out.println();
        }
    }
}      
import java.util.*;
public class Divisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = 10;
        int count = 0;
        int max = N;
        int i = 1;
        while (true){
            if (N%2==0){
                N = N/2;
                count++;
            }
            else{
                if(N%3==0){
                    N = N/3;
                    count++;
                }
                else if(N%5==0){
                    N = N/5;
                    count++;
                }
                else if(N%7==0){
                    N = N/7;
                    count++;
                }
            }
            if(N==1){
                break;
            }
            }
            System.out.println(count);     
        }
       
}
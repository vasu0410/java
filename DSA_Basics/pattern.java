import java.util.*;

public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            if(i==0 || i==n-1){
                for(int j=0;j<n+1;j++){
                    if (j<=i)
                    System.out.print("*");
                }
            }
            else{
               
                System.out.print("*");
                for(int k=0;k<i;k++){
                    System.out.print("^");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
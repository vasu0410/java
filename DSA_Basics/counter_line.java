import java.util.*;

public class counter_line {
    static int line(int sum,int adj,int n,int l){
        System.out.println("y");
        System.out.println(l);
        if(sum+adj>=n){
            System.out.println("sum ."+(sum+adj));
            return l;
            
        }
        else{
            
            System.out.println("sum "+sum);
            return line(sum+1,adj+2,n,++l);
        }
    }
    static int counter(int m,int n,int k){
        
               int sum;
               if(n%m==0){
                
                return n/m;
                }
                else{
                    sum = n/m;
                    
                    return line(sum*m,0,n,0)+n/m;
                }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();
        int people = sc.nextInt();
        int k_counter = sc.nextInt();

        System.out.println(counter(counter,people,k_counter));
    }
}

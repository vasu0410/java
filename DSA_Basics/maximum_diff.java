import java.util.*;
    public class maximum_diff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int diff = 0;
         
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();		
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
            
                if (a[j]>a[i] && diff<j-i){
                    diff = 	j-i;
                    System.out.println(a[j]+" "+a[i]);
                }
                
            }
        }
        if (diff>0){
                System.out.print(diff);

        }
        else{
            System.out.print(-1);
        }
        
    }
}
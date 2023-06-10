import java.util.*;
public class closet_sum {

// Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
// Output: 22 and 30
    
    static void close_sum(int[] arr,int x){
        int i=0,j=arr.length-1;
        int ans=95678901;    
        int a[] = new int[2];
        while(i<j){
            
            if(arr[i]+arr[j]>x){
                
                if(ans>(arr[i]+arr[j])-x){
                    ans = (arr[i]+arr[j])-x;
                    a[0] = arr[i];
                    a[1] = arr[j];
                }
                

                j--;
            }
            else{
                
                if(ans>(arr[i]+arr[j])-x){
                    ans = x-(arr[i]+arr[j]);
                    a[0] = arr[i];
                    a[1] = arr[j];
                }
                
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        close_sum(arr,x);
    }
}

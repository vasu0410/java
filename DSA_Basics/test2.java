import java.util.*;

// Input:

// N = 9

// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// 9 -2 4 -1 5 -5 0 -3 2
// 0  1  2    4    
// Output:

// 9 -2 4 -1 5 -5 0 -3 2
public class test2 {

    static void function(int[] arr,int n){
        for(int i=0;i<n;i++){
            int k = i;
            if(i%2==0){
                if(arr[i]<0){

                        
                while(true){                    
                    if(arr[k]>=0){
                        break;
                    }
                    k++;
                }
                }
            }
            else{
                if(arr[i]>=0){
                while(true){                    
                    if(arr[k]<0){
                        break;
                    }
                    k++;
                }
            }
            }    
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
                    
            
        }
        System.out.print(Arrays.toString(arr));
    }   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        function(arr, n);
    }
}

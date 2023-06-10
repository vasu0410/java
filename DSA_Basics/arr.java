import java.util.*;
public class arr {
    

// 1 2 -1 3 1 10 1  
// 2 3 10
// 1 2 3 5 4
// 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // int[] arr = {13, 14, 15, 16, 18, 19, 20};
        
            // 1 2 4 5   16 18 14-13 =1
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=1;i<arr.length-1;i++){
        //     // System.out.print(arr[i]);
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
    //    int sum = 0;
    //     for (int i = arr[0];i<=arr[arr.length-1];i++) {
    //         {
    //             sum = sum+ i;
                
    //         }
    //     }
       
    //     for(int i=0;i<arr.length;i++){
    //         sum = sum-arr[i];
    //     }
        // System.out.println(sum);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        
        HashMap <Integer,Integer>map = new HashMap<>();
        
        int[] arr = {2,4,8,16};
            
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        System.out.println(map);
    }
}

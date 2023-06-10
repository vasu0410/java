import java.util.Arrays;

public class sort_zero_one_two {
    static void swape(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,2};

        //      Bubble sort
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]>arr[j]){
        //             swape(arr,i,j);
        //         }
        //     }
        // }
            
        //      Selection sort
        // for (int i = 0; i < arr.length-1; i++) {
        //     int mid_idx = i;    
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j]<arr[mid_idx]){
        //                 mid_idx =j;
        //             }
        //         }
        //     swape(arr, mid_idx, i);  
        //     System.out.println(Arrays.toString(arr));    }
        
        // Insertion sort
        // int count = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     int key = arr[i];     
        //     int j = i-1;           
        //     int flag=-1;
        //     while(j>=0 && arr[j]>key){   
        //         arr[j+1] = arr[j];
        //             j = j-1;
        //             flag =1;
        //     }
        //     if(flag ==1){
        //         count++;
        //     }
        //     arr[j+1] =key;
        //     System.out.println(Arrays.toString(arr));
        // }
       
    }
}

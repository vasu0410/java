import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      System.out.print(findx(arr,n,k)+" "+lindx(arr,n,k));
      
    }
   static int findx(int[] arr,int n,int k){
      
      int start = 0;
      int l_ind = -1;
      int last = n-1;
      while(start<=last){
        int mid = start+(last-start)/2;  
          if (arr[mid]>k){
              last = mid-1;
          }
          else if(arr[mid]<k){
              start = mid+1;
          }
          else{
            l_ind = mid;
            last = mid-1;
          }
          }
        return l_ind;
      }
   
    static int lindx(int[] arr,int n,int k)
    {
        
        int start = 0;
        int l_ind = -1;
        int last = n-1;
        while(start<=last){
        int mid = start+(last-start)/2; 
          
            if (arr[mid]>k){
                last = mid-1;
            }
            if(arr[mid]<k){
                start = mid+1;
            }
            else{
              l_ind = mid;
              start = mid+1;
            }
            }
          return l_ind;
    } 
}

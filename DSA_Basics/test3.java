import java.util.*;

// [11,,2,2,3,3,4,4,4,5,5]

// target = 2
public class test3 {
    static int func(int[] arr,int l,int h,int t){
            int idx = -1;
           while(l<=h){
                int mid = l+(h-l)/2;
                

                if(arr[mid]>t){            //1,1,2,2
                    h=mid-1;
                }
                else if(arr[mid]<t){
                    l = mid+1;
                    

                }
                else{                        // arr[mid] == 2;
                   idx = mid;
                //    l = mid+1;
                   h = mid-1;
                }
                
                
                
            }
            return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,3,3,4,4,4,5,5};
        int t = sc.nextInt();
        int n = arr.length;
        System.out.println((func(arr, 0, n-1, t))); 
        }
}

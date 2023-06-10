import java.util.*;
public class binary_ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        float[] arr = new float[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        System.out.println(ceiling(arr, n, k));

    }
    static float ceiling(float[] arr,int n,int k){
        int start = 0;
        float ans = -1;
        int end = n-1;
        while((end-start)+1>0){
            int mid = (start+end)/2;
            if(k==arr[mid] || k+1>=arr[mid] && k<arr[mid]){
                ans = arr[mid];
                start = mid+1;
            }
            else if(k<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}

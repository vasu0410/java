public class dynamic_pg {
    static boolean isSubset(int[] arr,int n,int sum){
        if (sum==0)
        return true;

        if(n==0)
        return false;

        if(arr[n-1]>sum)
        return isSubset(arr, n-1, sum);

        return isSubset(arr, n-1, sum) || isSubset(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2};
        int sum = 20;
        int n = arr.length;
        if(isSubset(arr,n,sum)==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

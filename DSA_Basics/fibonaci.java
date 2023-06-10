public class fibonaci {
    private static int fibo(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-2)+fibo(n-1);
    }
    // gcm using recursively
    public static int gcm()

    private static int fibo_dp(int n){
        int[] arr = new int[n+2];
        
        arr[0] = 0;
        arr[1] = 1;

        if(n>1){
            for(int i=2;i<=n;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo_dp(10));

    }
}

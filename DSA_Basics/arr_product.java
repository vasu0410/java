public class arr_product {
    public static void main(String[] args) {
        int[] arr = {0,3,1,3};
        int[] ans = new int[arr.length];
        int sum = 1;     
        boolean zero=false;   
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && zero == false){
                zero = true;
                continue;
            }
            sum *= arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(zero==true)
                if(arr[i]==0){
                    ans[i] = sum;
                }
                else{
                    ans[i] = 0;
                }
            else
                ans[i] = sum/arr[i];
        }
            
        for(Integer i: ans)
            System.out.print(i+" ");    
    }
}

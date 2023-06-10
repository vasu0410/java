public class mergesort {
    static void mergesort(int[] arr,int l,int m,int r){
       int n1 = m-l+1;
       int n2 = r-m;

       int L[] = new int[n1];
       int R[] = new int[n2];

       for (int i = 0; i < n1; i++) {
           L[i] = arr[l+i];
       }
       for (int j = 0; j< n2; j++) {
           R[j] = arr[m+1+j];
       }
       int i=0,j=0;
       int k=l;

       while(i<n1 && j<n2){
           if(L[i]<=R[j]){
               arr[k]=L[i];
               i++;
           }
           else{
                arr[k]=R[j];
                j++;
           }
           k++;
       }
       while(i<n1){
           arr[k]=L[i];
           i++;
           k++;
       }
       while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
       }
       
    }
    static void msort(int[] arr,int l,int r){
        if(l<r){
            int m = (r+l)/2;

            msort(arr, l, m);
            msort(arr, m+1, r);
            mergesort(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        int n = arr.length;
        
        msort(arr, 0, n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

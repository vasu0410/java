public class rotate_sort_find {
    static int rotate_sort_find(int[] arr,int l,int h,int key){
        int mid = (l+h)/2;
        if(arr[mid]==key)
            return mid;

        if(arr[l]<=arr[mid]){

            if(key>=arr[l] && key <= arr[mid])
                return rotate_sort_find(arr, l, mid-1, key);
            
            return rotate_sort_find(arr, mid+1, h, key);    
        }

        if(key >= arr[mid] && key <= arr[h])
            return rotate_sort_find(arr, mid+1, h, key);
        return rotate_sort_find(arr, l, mid-1, key);    
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int key = 3;

        int n = arr.length-1;
        rotate_sort_find(arr,0,n,key);
    }
}

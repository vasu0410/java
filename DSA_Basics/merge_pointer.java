import java.util.*;
public class merge_pointer {
    static void merge_arr(int[] a,int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int c[] = new int[n1 +n2];

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=a[j++];
            }
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }

        for(int e:c){
            System.out.print(e+" ");
        }
    }
    public static void main (String[] args) {
                      // Your code here

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }

            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }

            merge_arr(arr1,arr2);
    }
}

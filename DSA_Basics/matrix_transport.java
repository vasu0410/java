import java.util.*;
public class matrix_transport {
    static void printtt(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // arr
        //int n =sc.nextInt();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] br = new int[n][n];

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         ar[i][j] = sc.nextInt();
        //     }
        // }
        // printtt(ar);
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        

        // for(int i=n;i<0;i++){
        //     for(int j=0;j<n;j++){
        //        br[i][j] = ar[j][i];
        //     }
        // }
    }
}

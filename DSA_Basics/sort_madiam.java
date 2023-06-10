import java.util.*;
public class sort_madiam {
    static double madiam(int[] res){
        double ans = 0;
        if(res.length%2==0){
            ans = (double)((res[res.length/2]+res[(res.length/2)+1]))/2;
        }
        else{
            ans = (double)(res.length/2+1);
            System.out.println(res.length/2+1);
        }
        return ans;

    } 
    static double sort(int n,int m,int[] a,int[] b){
        int i =0;
        int j =0;
        int k =0;
        int res[] = new int[n+m];
        while(i<n && j<m){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
            }
            else{
                res[k]=b[j];
                j++;
            }
            k++;
            }
        while(i<n){
            res[k]=a[i];
            i++;
            k++;
        }
        while(j<n){
            res[k]=b[j];
            j++;
            k++;
        }    
        for (int l : res) {
            System.out.print(l+" ");
        }
            return madiam(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.format("%.2f",sort(n, m, a, b));

    }
}

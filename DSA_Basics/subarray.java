import java.util.*;
public class subarray{
    static int goodIndexCount =0;
    static boolean chk(int a[],int c[]){
            for (int i=1;i<c.length;i++){
                if(a[i]-a[i-1] != c[i]-c[i-1]){
                    return false;
                }
               
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1,2,4,1,2,3};
        int[] c = {1,2,3};
        sub_arry(arr, c);
    }
    static void sub_arry(int arr[],int c[]){
        
        int count =0;
        int[] a = new int[c.length];
        for (int i=0;i<arr.length-2;i++){
            count=0;
            for(int j=i;j<i+c.length;j++){
                a[count++] = arr[j];
            }
            if (chk(a,c)==true){
                goodIndexCount += 1;
            }
            else{
                int[] b = new int[c.length*2];
                count=0;
                for(int k=0;k<c.length*2;k++){
                    b[k]=a[count++];
                    if(count>=c.length){
                        count =0;
                    }
                }
                for (i=0;i<arr.length-2;i++){
                    count=0;
                    for(int j=i;j<i+c.length;j++){
                        a[count++] = arr[j];
                    }
                    if (chk(a,c)==true){
                        goodIndexCount += 1;
                        break;
                    }
                    }
                }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(goodIndexCount);
    }   

    }

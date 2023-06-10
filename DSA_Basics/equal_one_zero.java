import java.util.*;

public class equal_one_zero {
    static int equals_onezero(int[] arr,int n){
        int counter = 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                arr[i]=-1;
            }
            sum += arr[i];

            if(sum==0){
                counter++;
            }
            if(map.containsKey(sum)){
                counter +=map.get(sum);
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                map.put(sum,map.get(sum)+1);
            }
            System.out.println(map);
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(equals_onezero(arr, n));
    }
}

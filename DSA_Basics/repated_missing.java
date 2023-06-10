import java.util.*;
public class repated_missing {
    public static void main(String[] args) {
        int[] arr = {3,1,3};
        int n = arr.length;

        Map<Integer,Boolean> map = new HashMap<>();
            for (Integer i: arr){

                if(map.get(i)== null){
                    map.put(i,true);
                }
                else{
                    System.out.println("Repeating "+i);
                }
            }
            for(int i=1;i<=n;i++){
                if(map.get(i)== null){
                    System.out.println("Missing"+i);
                }
            }
    }
}

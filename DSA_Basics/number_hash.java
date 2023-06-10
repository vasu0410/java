import java.util.*;
public class number_hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        System.out.println("Orignal");
        map.forEach((k,v)->System.out.println(k+" "+v));
        
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                if(o2.getValue()==o1.getValue()){
                    return o2.getKey().compareTo(o1.getKey());
                }
                else{
                return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        
        for(Map.Entry<Integer,Integer> e : list){
            System.out.println(e.getKey());
        }
    }
}

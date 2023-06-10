import java.util.*;
class cricket{
    static int cricket_fever(int[] arr,HashMap<Integer,Integer> map){
        if (arr.length/2>0){
            
            int[] brr = new int[arr.length/2];
            int counter =  0;
            
            for(int i=0;i<arr.length;i+=2){
              
                if(map.containsKey(arr[i]) && map.containsKey(arr[i+1])){
                    if(arr[i]+map.get(arr[i+1])>=arr[i+1]+map.get(arr[i])){
                        
                        brr[counter++]=arr[i]+map.get(arr[i+1]);
                        map.put(arr[i]+map.get(arr[i+1]),arr[i+1]+map.get(arr[i]));
                    
                    }
                    else{
                        brr[counter++]=arr[i+1]+map.get(arr[i]);
                        map.put(arr[i+1]+map.get(arr[i]),arr[i]+map.get(arr[i+1]));
                    }
                   
                }
            
                else{
                    if(arr[i]>=arr[i+1]){
                        brr[counter++]=arr[i];
                        map.put(arr[i],arr[i+1]);
                    }
                    else{
                        brr[counter++]=arr[i+1];
                        map.put(arr[i+1],arr[i]);
                    }
                }
                 System.out.print(i+" "+map);
            }
            // System.out.print(map);
            return cricket_fever(brr,map);
         
        }
        else{
           
            return arr[0];
        }

    }
    public static void main (String[] args) {
                      // Your code here
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            
            HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
            

            //2^k teams
            int teams = (int)Math.pow(2,k);

            int[] supporter = new int[teams];

            for(int i=0;i<teams;i++){
                supporter[i]=sc.nextInt();
            }
            System.out.print(cricket_fever(supporter,map));
    }
}
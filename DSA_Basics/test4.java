import java.util.*;

import javax.xml.transform.Source;
public class test4 {
    public static void chk(String s1,String s2){
        //sadder dreads
        //sadder 
        //dreads
        if(s1.length()!=s2.length()){
            System.out.println("False");
            return;
        }
       HashMap <Character,Integer> map1 = new HashMap<Character,Integer>();
       HashMap <Character,Integer> map2 = new HashMap<Character,Integer>();
       
       for(int i=0;i<s1.length();i++){
           char c = s1.charAt(i);
        if(map1.containsKey(c)){

            System.out.println("uyeyiy");
            map1.put(c,map1.get(c)+1);
        }
        else
        map1.put(c,1);

        }
        
        
    
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(map2.containsKey(c)){
    
                map2.put(c,map2.get(c)+1);
            }
            else{
            map2.put(c,1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);

        int flag = 1;

        for(int i=0;i<s1.length();i++){
            if(!(map1.get(s1.charAt(i))==map2.get(s1.charAt(i)))){
                flag = 0;
            }
        }

        if(flag==0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        System.out.println(map1);
        System.out.println(map2);

        
    }
    public static void main(String[] args) {
        // String s1 = "sadder";
        // String s2 = "dreads";

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        chk(s1, s2);
        
    }
}

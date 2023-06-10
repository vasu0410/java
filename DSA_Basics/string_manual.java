import java.util.Scanner;

public class string_manual {
    static String toUpperCase(String s1){
        String s2 ="";
        for(int i=0;i<s1.length();i++){
            
            int c = s1.charAt(i);
            
            if(c>96 && c<123){
                c = c-32;
                s2 = s2+ Character.toString((char)c);
            }
            else
            s2 = s2+ Character.toString((char)c);
        }
        return s2;
    }
    static String toLowerCase(String s1){
        String s2 ="";
        for (int i = 0; i < s1.length(); i++) {
           
            int c = s1.charAt(i);
            if(c>64 && c<91){
                c = c+32;
                s2 += Character.toString((char)c);        
            }
            else{
            s2 += Character.toString((char)c);
            }
            
        }
        return s2;
    }
    static String toCapitalCase(String s1){
        String s2 ="";
        for (int i = 0; i < s1.length(); i++) {
            int c = s1.charAt(i);
            if(i==0 && c>96 && c<123){
                c= c-32;
                s2 += Character.toString((char)c);
            }
            else if(c>64 && c<91 && i!=0){
                c = c+32;
                s2 += Character.toString((char)c);
            }
            else{
                s2 += Character.toString((char)c);
            }
        }
        return s2;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(toCapitalCase(s1));
        System.out.println(toLowerCase(s1));
        System.out.println(toUpperCase(s1));
    }
}

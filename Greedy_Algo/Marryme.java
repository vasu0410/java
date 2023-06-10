import java.util.*;
public class Marryme {
    private boolean Marryme_try(String R,String G){
        int r = R.length();
        int g = G.length();
        String smaller;
        String larger;
        if(r<g){
            smaller = R;
            larger = G;
        }
        else{
            smaller = G;
            larger = R;
        }
        int i=0,j=0;
        while(i<smaller.length() && j<larger.length()){
            if(smaller.charAt(i)==larger.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==smaller.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextInt();
        while(T!=0){
            String R = sc.next();
            String G = sc.next();

            if(Marryme_try){
                System.out.println("");
            }
        }
    }
}

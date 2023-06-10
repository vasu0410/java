public class fect {
    static int fact_finder(int n){
        if (n<=1){
        return 1;
        
        }
        else{
            return n*fact_finder(n-1);
        }
    }
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println(fact_finder(n));
    }
}

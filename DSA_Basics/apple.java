import java.util.*;
    public class apple{
       public int help(int sum) {
        
       
        int count =0;
        for (int i=1;i<sum;i++){
            for (int j=1;j<sum;j++){
                if (i+j==sum){
                count++;
                }
            }
        } 
        return 1;

        //throw new UnsupportedOperationException("help(int sum)");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        apple a = new apple();
        int r = sc.nextInt();
        r = a.help(r);
        System.out.println(r);
    }

}
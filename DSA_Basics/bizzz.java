import java.util.*;

public class bizzz{

    public static boolean chkPrime(int n){
        // this function use to check num is prime or not.
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean is_belzabar_number(int num){
        // this function is use to check given number is belzaber or not.
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                // ifnumber is not prime then it's not belzaber.
                return false;
            }
        }
        //check the condition forbelzaber number.
        if(chkPrime(num+20) && num < num+20){
            return true;
        } 
        else if(chkPrime(num-20) && num > num-20){
            return true;
        } 
        else{
            return false;
        }
    }

    public static void countNum(int n){
        int count = 0;
        for(int num = 2; num <= n; num++){
            if(is_belzabar_number(num)){
                count++;
            }
        }
        System.out.println("Belzabar numbers less than or equal to 1 million ="+count);
    }

    public static void countNum2(int n){
        int count = 0;
        for(int num = 2; num <= n; num++){
            if(is_belzabar_number(num) && chkPrime(num)){
                count++;
            }
        }
        System.out.println("Belzabar numbers from bonus question #1 above that are prime ="+count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(is_belzabar_number(num)){
            System.out.println("Number "+num+" is belzabar number");
        }
        else{
            System.out.println("Number "+num+" is not belzabar number");
        }
        // count Belzabar numbers less than or equal to 1 million.
        countNum(1000000);
        // count Belzabar numbers less than or equal to 1 million and prime.
        countNum2(1000000);
    }
}

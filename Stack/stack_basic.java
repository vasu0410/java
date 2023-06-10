package Stack;
import java.util.*;

public class stack_basic{
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String s = "2 1 + 3 *";

        

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c ==' '){
                continue;
            }
            else if(Character.isDigit(c)){
            int n = 0;
            
            while(Character.isDigit(c)){
                n = n*10 +(int)(c-'0');
                // System.out.print(n+" ");
                i++;

                c = s.charAt(i);
                stack.push(n);

            }
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                System.out.println("val1 ="+val1+" val2 "+val2);

                switch(c){
                    case '+':
                    stack.push(val2+val1);
                    break;

                    case '*':
                    stack.push(val2*val1);
                }
            }
            

            }
        
        while(stack.isEmpty()==false){
            System.out.println(stack.pop());
        }
    }

}

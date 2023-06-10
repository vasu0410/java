import java.util.Scanner;

import Stack.stack_basic;

import java.util.*;
public class sub_array {

        static int sub_array(int[] arr,int sum,int mul,int k){
            int sum1;
            int mul1;
            if(k==1){
                for(int i:arr){
                    if(i==k){
                        return 1;
                    }
                }
            }
            else{
                for(int i=0;i<=arr.length-k;i++){
                    sum1 = arr[i];
                    mul1 = arr[i];
                    

                    for(int j=i+1;j<i+k;j++){
                        sum1 +=arr[j];
                        mul1 *=arr[j];
                        if((sum==sum1)&&(mul==mul1)){
                            return 1;
                        }
                    }
                    

                }
                return 0;
            }
            return -1;
        }
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            // int[] arr = {6, 5, 4, 3, 2, 1};
            int sum=0;
            int mul=1;

            for(int k=1;k<=3;k++){
                sum += k;
                mul *= k;
                System.out.print(sub_array(arr,sum,mul,k)+" ");
                
            }
          
        }
}

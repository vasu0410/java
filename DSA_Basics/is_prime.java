import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class is_prime{
    static int g(int n,int m){
        int pro = 1;
        int[] prime = {2,3,5,7,11,13};
        for(int i=0;i<prime.length;i++){
            if (n%prime[i]==0)
            {
                pro *= f(m,prime[i]);
                                
            }
        }
        return pro;
    }
    static int f(int m,int x){
        int ans =0;
        for(int i=0;i<Math.sqrt(m);i++)
        {
            int pow = (int)Math.pow(x,i);      
            
            if(m%pow==0){  
            ans=pow;
                }
            else
                break;    
        }
        return ans;
    }
	public static void main (String[] args) {
                      // Your code here
                Scanner sc= new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                
                
                if (n>m)
                System.out.print(g(n,m));      
                else
                System.out.print(g(m,n));      
                
	}
}

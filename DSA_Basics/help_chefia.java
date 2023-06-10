import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class help_chefia{
	public static void main (String[] args) {
                      // Your code here
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();

				while(T-->0){
					long N = sc.nextLong();
					int K = sc.nextInt();

					String s = Long.toBinaryString(N);
					char i = s.charAt(s.length()-K);
                    if(i=='1'){
						System.out.println("SET");
						s.length();
					}
					else{
						System.out.println("NOT SET");
                
					}
				}	  
	}
}
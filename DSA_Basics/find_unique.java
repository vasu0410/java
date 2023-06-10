import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class find_unique{
	public static void main (String[] args) {
                   // Your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				a =sc.nextInt();
				if(map.containsKey(a))
				map.put(a,i+1);
				else
				map.put(a,1);		
			}
			
			for(int i:map.keySet()){
				if(map.get(i)==1)
				System.out.print(i);
			}
	}		  
	
}
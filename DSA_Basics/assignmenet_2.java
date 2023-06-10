import java.util.*;
public class assignmenet_2{
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            double ans = 0;
			int N = sc.nextInt();
            
			if (N<=0){
				System.out.println(0);
			}
			else{
			int[] A = new int[N];
			float sum = 0;
			for(int i=0;i<N;i++){
				A[i] = sc.nextInt();
				A[i] = A[i]*A[i];
				sum += A[i];

			}
            ans = sum/N;
            
            System.out.println(ans);
			System.out.printf("%.6f",Math.sqrt(ans));
			}
}
}
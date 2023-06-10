import java.util.*;
public class equation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();

		Double r1,r2,i,d;

		d=(b*b)-(4*a*c);

        int result = d > 0? 1 : d < 0? -1: 0;
		switch(result)
        {
			
			case 1:
				r1 = (-b+Math.sqrt(d))/(2*a);
				r2 = (-b-Math.sqrt(d))/(2*a);
				System.out.printf("%.2f\n",r1);
				System.out.printf("%.2f\n",r2);
				break;

            case -1:

                r1=r2=(-b/(2*a));
                i=(Math.sqrt(-d))/(2*a);
                System.out.printf("%.2f + i%.2f\n",r1,i);
                System.out.printf("%.2f - i%.2f\n",r2,i);
                break;

            case 0:
                
                r1=r2= (-b/(2*a));
                System.out.println(r1);
                break;


				}	
				
		}
}

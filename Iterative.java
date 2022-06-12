import java.util.ArrayList;
import java.util.Scanner; 

public class Iterative {
	public static void main(String[] args) {
		long starttime = System.nanoTime();
		
		int j=0;
		int k=1;
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		
		System.out.print("Enter number of entries to add to the sequence : ");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		i=i-2;
		sc.close();
		while (i>0) {
			int p=fib.get(j)+fib.get(k);
			fib.add(p);
			j=j+1;
			k=k+1;
			i--;
		}
		
		System.out.println(fib);
		long endtime = System.currentTimeMillis();

		System.out.println("Execution time (nano-seconds) : " + (starttime-endtime));
	
		
	}

}


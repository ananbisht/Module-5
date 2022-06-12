import java.util.Scanner; 

public class Recursive {
	
	public static int add(int p) {
		if (p==0)
				return 0;
		else if (p==1 || p==2)
			return 1;
		
		return add(p-2)+add(p-1);
	}
	public static void main(String[] args) {
		long starttime = System.nanoTime(); 

		System.out.print("Enter number of entries to add to the sequence : ");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		sc.close();
		
		for (int k=0; k<i; k++) {
			System.out.print(add(k) + ", ");
		}
		System.out.println();
		long endtime = System.currentTimeMillis();
		System.out.println("Execution time (nano-seconds) : " + (starttime-endtime));
	}
}

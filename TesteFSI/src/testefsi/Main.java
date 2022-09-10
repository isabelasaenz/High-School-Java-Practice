package testefsi;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int R1 = scan.nextInt();
			int X1 = scan.nextInt();
			int Y1 = scan.nextInt();
			
			int R2 = scan.nextInt();
			int X2 = scan.nextInt();
			int Y2 = scan.nextInt();
			
			double dm = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
			
			if((R1 - dm) >=R2) {
				System.out.println("RICO");
			}else {
				System.out.println("MORTO");
			}
		}
	}
}


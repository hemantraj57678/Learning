import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter  value of N :");
		int n = s.nextInt();
//		System.out.println("\n\n\n");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>1 && i<n) {
					if(j>1 && j<n) {
					System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else {
			System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}

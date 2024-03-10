import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter  value of N :");
		int n = s.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n;j++) {
				if(i<=j) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}

}

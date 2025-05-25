package Lec_4;

public class pattern3Method2RelativeIdea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int row=1;
		
		int nst=5; // nst -> No of Stars for 1st row
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
			}
			// preparation for Next row
			nst=nst-1;
			
			row=row+1;
			System.out.println();
		}
		
	}

}

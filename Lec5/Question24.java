package Lec5;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1;

		int nst = 1;
		int nsp = 4;

		
		while (row <= 5) {

			// work
			// work for space
			int i = 1;
			while (i <= nsp) {
				System.out.print(" " + "\t");
				i = i + 1;
			}

			// work for Star
			int j = 1;
			int counting=1;
			while (j <= nst) {
				System.out.print(counting + "\t");
				counting++;
				j = j + 1;
			}
			// preparation for Next row
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
			System.out.println();	
		}
	}

}

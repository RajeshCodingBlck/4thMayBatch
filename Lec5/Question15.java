package Lec5;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int row = 1;
		int nsp = 3;
		int nst = 1;
		while (row <= 7) {

			// work
			// work for Space
			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+" ");
				i = i + 1;
			}

			// work for Star
			int j = 1;
			while (j <= nst) {
				System.out.print("*"+" ");
				j = j + 1;
			}

			// Preparation for Next row..

			if (row < 4) {
				nst = nst +2;
				nsp = nsp -1;
			} else {
				nst = nst -2;
				nsp = nsp +1;
			}

			row = row + 1;
			System.out.println();
		}
	}

}

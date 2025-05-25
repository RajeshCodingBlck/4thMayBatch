package Lec_4;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int row=1;
		while(row<=n) {
			
			// work
			int i=1;
			while(i<=n) {
				// work
				System.out.print("*");
				i=i+1;
			}
			
			row=row+1;
			System.out.println();
		}
		
	}

}

package Lec3;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int  n= s.nextInt();
		
		int sum=0;
		int i=1;
		while(i<=n) {
			// work
			sum= sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}

}

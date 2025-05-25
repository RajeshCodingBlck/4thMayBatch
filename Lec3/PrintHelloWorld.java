package Lec3;

import java.util.Scanner;

public class PrintHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
	  // Initialization
		int i=1; // ith Hello World ko print karne ja raha hu
		
		while(i<=n) {
			// work
			System.out.println("Hello World");
			i=i+1; // Re -intialization
		}
		
	}

}

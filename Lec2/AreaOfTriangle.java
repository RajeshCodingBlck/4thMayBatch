package Lec2;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s= new Scanner(System.in);
		
//		System.out.println("Enter the base");
		int base = s.nextInt();
		int height= s.nextInt();
		
		int area=  (base*height) /2;
		
		System.out.println(area);
		
		
	}

}

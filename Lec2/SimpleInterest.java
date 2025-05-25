package Lec2;

import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		int p=1000;
//		int r= 10;
//		int t=1;
		
		Scanner s= new Scanner(System.in);
		
		int p= s.nextInt();
		int r= s.nextInt();
		int t= s.nextInt();
		
		
		int si= p*r*t /100;
		System.out.println(si);
		
	}

}

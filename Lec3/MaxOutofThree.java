package Lec3;

import java.util.*;

public class MaxOutofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int a= s.nextInt();
       int b= s.nextInt();
       int c= s.nextInt();
       
       
        if(a> b && a>c) {
        	System.out.println("a is Maximum");
        }else if(b>c) {
        	System.out.println("b is Maximum");
        }else {
        	System.out.println("c is Maximum");
        }
       
       
       
       
       
       
       
       
//       if( a > b && a > c) {
//    	   System.out.print("a is Maximum");
//       }else {
//    	   if(b>c) {
//    		  System.out.println("b is Maximum");
//    	   }else {
//    		  System.out.println("c is Maximum");
//    	   }
//       }
      
        
        
        
//        int a=12;
//        
//        if(a==13){
//            System.out.println("print from first if");
//        }else if(a==12){
//            System.out.println("print from second if");
//        }else if(a==12){
//             System.out.println("print from third if");
//        }else if(a==12){
//             System.out.println("print from forth if");
//        }
        
        
	}

}

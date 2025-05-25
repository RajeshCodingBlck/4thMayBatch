package Lec_4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	   int row=1;
	   while(row<=5) {
		   // work
		   int i=1;
		   while(i<= (6-row)) {
			   System.out.print("*");
			   i=i+1;
		   }
		   row=row+1;
		   System.out.println();
	   }
	}

}

package Lec5;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int row=1;
		
		int leftStar=5;
		int rightStar=5;
		int nsp=-1;
		
		while(row<=5) {
			
			// work
			
			// work for LeftStar
			int i=1;
			while(i<=leftStar) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			// work for  space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			// work for right Star
			int k=1;
			if(row==1) {
				k=2;
			}
			while(k<=rightStar) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			// Preparation for Next row
			leftStar=leftStar-1;
			rightStar=rightStar-1;
			nsp= nsp+2;
			row=row+1;
			System.out.println();
		}
		
	}

}

package Calculator;

import java.util.Scanner;

public class Task1Calculator {
	
	
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		int n1,n2;
		
		boolean flag=true;
		
		while(flag) {
			
			
			System.out.println("1.ADD\n2.Substraction\n3.Multiply\n4.Divide\n5.Exponentiation\n6.Quit");
			System.out.println("Select Operation : ");
			int choice=sca.nextInt();
			
			if(choice==6) {
	            	System.out.println("Thank you!!,Calculator is Exit!!");
	            	break;
	            }
			
			int result=0;
			System.out.println("enter first Number : ");
			n1=sca.nextInt();
			System.out.println("enter Second Number : ");
			n2=sca.nextInt();
			
			switch(choice) {
			
			 
			case 1:
				             result = n1 + n2;
				             break;
			case 2:
				             result = n1 - n2;
				             break;
			case 3:
			           	     result = n1 * n2;
				             break;
			case 4:
				             if (n2 == 0) {
					          System.out.println("Error!!,We can't devide With '0' ");
				             } else
					         result = n1 / n2;
				             break;
			case 5:
				             result=(int)Math.pow(n1, n2);
				             break;
		
		    default:
		    	          System.out.println("In-valied Choice!!,choice Correct One!!");
		    	          break;
		    	
			}
			System.out.println("Result is : "+result);
			System.out.println("-------------------------");
			
		}
		sca.close();
	}
	
	

}

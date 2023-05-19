package javaflowcontrol;
import java. util.Scanner;
public class NestedIfStatement {

	public static void main(String[] args) {
		
		//create object of scanner
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the No to be checked:");
		int num1 = sc.nextInt();
		if (num1>=23)
		{
			System.out.println("Number 1 is :" +num1+ "and it is greater than 23");
		
		if (num1>=45) {
			System.out.println("Oh!! its greater than 45 also");
			
		}
		else 
		{
			System.out.println("but, the No" +num1+"is less than 45");
		}
		}
		else
		{
			System.out.println("the NO " +num1+ "is less than 23");
			}
	
	}
	
}	
		





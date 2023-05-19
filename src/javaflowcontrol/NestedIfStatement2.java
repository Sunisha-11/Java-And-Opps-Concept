package javaflowcontrol;

import java.util.Scanner;

public class NestedIfStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner (System.in);
	System.out.println("Enter Your age :");
	
	int age = scan.nextInt();
	System.out.println("Enter Your Blood Group :");
	String Bloodgroup  = scan.next();
	
	if (age>=18)
		
	{
		System.out.println("You are eligible for blood donation");
		if(Bloodgroup.equals("o++"))
		{
			System.out.println("You are an Universal Doner");
		}
		else
		{
			System.out.println("You are not an Universal Doner");
		}
	}
	else
	{
		System.out.println("You are not allowed for blood donation");
	}
	
	}

}

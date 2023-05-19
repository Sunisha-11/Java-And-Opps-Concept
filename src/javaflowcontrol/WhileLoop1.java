package javaflowcontrol;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the value");
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		while(n<5)
			{
			System.out.println("this is a Whileloop");
		}
		System.out.println("End of program");
			}
	}


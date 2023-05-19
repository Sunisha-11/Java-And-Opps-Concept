package javaflowcontrol;

import java.util.Scanner;

public class MultiDimensionalArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int Rollnum[]=new int[5];
		String Name[]= new String[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Roll Num and Name of Student" +(i+1)+":");
			Rollnum[i]=scanner.nextInt();
			Name[i]=scanner.next();
		}
	System.out.println();
	}

}

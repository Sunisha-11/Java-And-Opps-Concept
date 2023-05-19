package interface1;

import java.util.Scanner;

public class customer implements client {
String name;
int salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
client c= new customer();
c.input();
c.output();
c.print();
	}
public void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user name: ");
	name=sc.nextLine();
	System.out.println("Enter salary: Rs.");
	salary =sc.nextInt();
} 
	public void output()
	{
		System.out.println(name+" "+salary);
	}
	@Override
	public void print() 
	{
		System.out.println("This is output");
	}
	

}

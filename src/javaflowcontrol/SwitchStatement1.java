package javaflowcontrol;

public class SwitchStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
String action = "multiplication";
	switch(action)
	{
	case "addition":
	{
		int c=a+b;
		System.out.println(c);
		break;
	}
	case "multiplication":
	{
		int c=a*b;
		System.out.println(c);
		break;
		
	}
	case "substraction":
	{
		int c= b-a;
		System.out.println(c);
		break;
		
	}
	default:
	{
		System.out.println("no action is done");
	}
	}
	
		
	}

}

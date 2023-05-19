package objectorientedprogamingsystem;

public class ChildMethodOverriding extends ParentMethodOverriding

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethodOverriding cmo = new ChildMethodOverriding();
		cmo.explicitWait(100);
	}
	public void explicitWait(int duration)
	{
		System.out.println("explicit wait is "+ duration+ "Seconds" );
	}
	
	
}

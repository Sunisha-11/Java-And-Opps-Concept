package objectorientedprogamingsystem;

public class child extends parent 
{

	public static void main(String[] args) 
	{
	child c = new child();
	//parent p = new parent(); //can be Accessible
	//	child c1= new parent();//not Accessible
	//parent p1= new child();//can be Accessible
	//p1.ParentDemoMethod();
	c.ChildDemoMethod();
	}
public void ChildDemoMethod()
{
	System.out.println("this is Child demo Method");
}
}

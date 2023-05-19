package javaconsept5;

public class StaticBlock {
	int num ;
	
	//constructor 
	public StaticBlock()
	{
		//System.out.println("this is a Constructor");
		num = 20;
	}
	// second Parameterized constructor
	public StaticBlock(String Name)
	{
	//System.out.println("this is a Parameterized Constructor" );
		System.out.println(Name);
	}
	//staticblock declaration
static
{
	System.out.println("this is first static block");
	
}
static
{
	System.out.println("this is second static block");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlock bb = new StaticBlock();//first Object Created for zero orgument constructor
		
		System.out.println(bb.num);

		StaticBlock cc = new StaticBlock("Sunisha");// second Object created for parameterized constructor
		

	}
	{
		System.out.println("This is a First Instance Block");//instance block
		
	}
	
	{
		System.out.println("This is a Second Instance Block");//instance block
	}

}

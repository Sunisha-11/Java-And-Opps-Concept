package javaconsept5;

public class InstanceBlock {
	int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlock bb = new InstanceBlock ();
		System.out.println(bb.num);
		//InstanceBlock bb1 = new InstanceBlock ();

	}
	{
		System.out.println("This is a InstanceBlock");
		num = 40;
	
	}
	{
		System.out.println("This is a InstanceBlock no 2"); 	
	}
	{
		System.out.println("This is a InstanceBlock no 3");
	}
	
}



package javaconsept5;

public class CostructorConsept5 {
	//variable declaration
	
	int empNo = 1234;
	public CostructorConsept5() 
	{
		System.out.println("User Defined Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CostructorConsept5 bb = new CostructorConsept5();
		System.out.println(bb.empNo);
		System.out.println("User Defined Constructor");
	}

}

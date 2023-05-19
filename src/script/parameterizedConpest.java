package script;

public class parameterizedConpest {
	//instance variable
	int rollnumber = 01;
	int rollnumber2 = 02;
	int rollnumber3 =03;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object is created to call the instance variable in satic area
		parameterizedConpest pc = new parameterizedConpest();
		 
		pc.printNO();
		
		

	}

	public void printNO()
	{
		System.out.println(rollnumber);
		System.out.println(rollnumber2);
		System.out.println(rollnumber3);
	}
	
	
}

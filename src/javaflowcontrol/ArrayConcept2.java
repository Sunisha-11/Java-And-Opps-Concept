package javaflowcontrol;

public class ArrayConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] empName= {"abir","ovi","arnav","rayna","anvika"};
		
		//for (int i=0; i<=4; i++)
		//{
		//	System.out.println(empName[i]);
		//}
		for (String name: empName)//advance for loop
		{
			System.out.println(name);
		}
	}

}

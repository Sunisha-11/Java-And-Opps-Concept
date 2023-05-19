package javaconsept4;

public class ConstructorConsept1 {

		String orgName = "Speedway Tech";
		
		public ConstructorConsept1 (int a, int b)
{
			int c ;
			c= a+b;
			System.out.println(c);
}

		
	
		public static void main(String[] args) {
		// TODO Auto-generated method 
			ConstructorConsept1 cc = new ConstructorConsept1(50,60);
					System.out.println(cc.orgName);
					
					
	}

}

package javaconsept4;

public class ConstructorConsept {
	String ClinicName = "Shri Sai Ayurved Clinic";
	
	public ConstructorConsept ()
	{
		System.out.println("Nashik is Best city");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConsept bb = new ConstructorConsept();
		System.out.println(bb.ClinicName);
		
		bb.name();
	}
	public void name()
	
	{
		 System.out.println("My Name is Sunisha");
}


}


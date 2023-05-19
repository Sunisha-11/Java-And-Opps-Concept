package objectorientedprogamingsystem;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading  mm = new MethodOverloading ();
		
		//mm.login ("Sunisha","sunee@11");
		//mm.login(1234);
		mm.login("suneesha@gmail");
	}
	public void login(String username,String Password)
	{
		System.out.println("login using usrname and password");
	}
	public void login(int otp)
	{
		System.out.println("login using otp");
	}
	public void login(String GoogleAccount)
	{
		System.out.println("login using GoogleAccount");
		
	}
}

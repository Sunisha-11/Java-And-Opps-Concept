package javaflowcontrol;

public class StringConditional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "safari";
				if(browser.equals("Chrome"))
				{
					System.out.println("we are using Chrome browser");
				}
				else if(browser.equals("firefox"))
				{
					System.out.println("we are using firefox browser");
				}
				else if(browser.equals("mac"))
				{
					System.out.println("we are using mac browser");
					
				}
				else
				{
					System.out.println("plsease select valid browser");
				}
	}
	

}

package objectorientedprogamingsystem;

public class Createcompany extends CRMpro {

	public static void main(String[] args)
	{
		
Createcompany cc= new Createcompany();

System.out.println(cc.logo);
cc.login();
cc.createContact();
cc.Createcompany();
cc.logout();
	}
public void Createcompany()
{
	System.out.println("Company Created Successfully");
	}
}

package objectorientedprogamingsystem;


   public class parent 
{
	private String Password = "Demo";  
	public static void main(String[] args) {
		
		parent pp= new parent();
		System.out.println(pp.Password);
		pp.ParentDemoMethod();
		}
			 public void ParentDemoMethod()
			{
		System.out.println("This is  Parent Demo Method");
			}
}

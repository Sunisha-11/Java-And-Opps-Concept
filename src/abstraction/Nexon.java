package abstraction;

public abstract class Nexon implements car
//normal class inheritance with interference classs use keyword implements
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nexon ns = new Nexon();
				//ns.engine();
				//ns.color();
				//ns.wheels();
				//ns.powerwindow();
	}
public void powerwindow() 
{
		System.out.println("widows are powerwindow");
		
	}
public void wheels()
{
System.out.println("Nexon is front wheel drive car");	
}
public void color()
{
System.out.println("Nexon color is black");
}
@Override
public void engine() 
{
System.out.println("Nexon is having 1.5l petrol engine");
	
}
@Override
public void sunroof() {
	// TODO Auto-generated method stub
	
}
@Override
public void stearing() {
	// TODO Auto-generated method stub
	
}

}

package abstraction;

public class TMNexon extends Nexon 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TMNexon Nexon= new TMNexon();
		Nexon.sunroof();
		Nexon.color();
		Nexon.engine();
		Nexon.powerwindow();
		Nexon.stearing();
		Nexon.gear();
		
		}
		public void sunroof()
		{
			System.out.println("nexon having sunroof");
		}
		public void stearing()
		{
			System.out.println("stearing is power stearing");
		}
		@Override
		public void gear() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void ADAS() {
			// TODO Auto-generated method stub
			
		}
		
}


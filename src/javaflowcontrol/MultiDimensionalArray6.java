package javaflowcontrol;

public class MultiDimensionalArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weekname[][]= {{"1","2","3","4","5","6","7"},{"Sunday","Monday",
			"Tuseday","Wednesday","Thursday","Friday","Saturday"}};
	
		for(int i=0;i<2;i++)//for rows
	{
		for(int j=0;j<7;j++) //for columns
		{
			System.out.print(weekname[i][j]+" ");
		}
	System.out.println();		
	}
	
	
	
	}

}

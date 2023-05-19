package javaflowcontrol;

public class MultiDimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MonthName[][]= {{"Jan","Feb","Mar","Apr","May","Jun"},
				{"Jul","Aug","Sept","Oct","Nov","Des"}};
		
		for (int i=0;i<2;i++)//for rows
		{
			for(int j=0; j<6; j++)  //for columns
				{
				System.out.print(MonthName[i][j]+" ");
				}
			System.out.println();
		}
		
	}
	

}

package javaflowcontrol;

public class MultiDimensionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stdData[][]= {{"RollN","Std Name"},{"1","sunisha"},
				{"2","Ovi"},{"3","Ryna"}};
		for (int i=0; i<4; i++)
		{
			for (int j=0;j<2;j++)
				{
				System.out.print(stdData[i][j]+"    ");
				}
			System.out.println();
		}
	
	}

}

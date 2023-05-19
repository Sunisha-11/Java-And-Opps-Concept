package javaflowcontrol;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[][]= {{1,2,3,4,5,6},{6,7,8,9,10}};
		
		for(int i=0;i<2;i++)   //rows

		{
			for(int j=0;j<5;j++ )
			{
				System.out.print(number [i][j]+" ");
			}
			System.out.println();
		}
	}

}

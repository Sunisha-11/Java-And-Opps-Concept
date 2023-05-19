package javaconsept;

public class ParameterizedConsept {
	int empno=1234;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConsept tc = new ParameterizedConsept();
		tc.printNO(5678);
		
}
	public void printNO(int empno)
	{
		System.out.println(empno);
		System.out.println(this. empno);
		System.out.println(empno);
	}

}

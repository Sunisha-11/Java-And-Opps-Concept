package javaconsept4;

public class Constructorconsept3 {
	int studentno = 11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorconsept3 nn = new Constructorconsept3();
		
		System.out.println(nn.studentno);
		nn.rollno();
	}
public void rollno() {
	 studentno = 12;
	System.out.println( studentno );
}
}

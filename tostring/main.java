package tostring;

public class main {
	public static void main(String[] args) {
		student s1=new student(101,"chandu",90);
		student s2=new student(101,"chandu",90);
		boolean b=s1.equals(s2);
		System.out.println(b);
	}

}

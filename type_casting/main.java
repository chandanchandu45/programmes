package type_casting;

public class main {
	int m1(int a,int b)
	{
		int c=a+b;
		return c;
	}
	double m1(double a,double b )
	{
		double c=a+b;
		return c;
	}
	public static void main(String[] args) {
		main m=new main();
		m.m1(1, 2);
	}

}

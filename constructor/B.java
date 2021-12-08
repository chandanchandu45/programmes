package constructor;

public class B extends A
{
	void m1()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.m1();
	}
}

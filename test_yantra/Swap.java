package test_yantra;

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;// 30
		b = a - b;// 10
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
}

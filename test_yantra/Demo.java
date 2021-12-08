package test_yantra;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			try{
				int[] x=new int[2];
				x[3]=50;
			}
			catch(Throwable e)
			{
				System.out.println("size exceed");
			}
			int result = a / b;
		} catch (Exception e) {
			System.out.println("denominator should not be zero");
		}
		sc.close();
	}
}

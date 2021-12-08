package abcd;
import java.util.Scanner;
public class A {
	int fact=1;
	int i=1;
	void factorial(int n)
	{
		if(i<=n)
		{
			fact=fact*i;
			i++;
			factorial(n);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int i=sc.nextInt();
	A a=new A();
	a.factorial(i);
	System.out.println("factorial of "+i+" is "+a.fact);
}
}

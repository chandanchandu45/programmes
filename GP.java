import java.util.Scanner;
public class GP {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter the values of a");
	double a=sc.nextDouble();
	System.out.println("enter the values of b");
	double b=sc.nextDouble();
	System.out.println("enter the number of iterations has to be done");
	int c=sc.nextInt();
	double d=a+Math.pow(2,0)*b;
	System.out.print(d+",");
	for(int i=1;i<c;i++)
	{
		 d=d+Math.pow(2,i)*b;
		System.out.print(d+",");
	}
	
}
}

import java.util.*;
public class quad {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double result =(-b+(Math.sqrt(b*b-4*a*c)))/2*a;
	double result1=(-b-(Math.sqrt(b*b-4*a*c)))/2*a;
	System.out.println(result);
	System.out.println(result1);
}
}

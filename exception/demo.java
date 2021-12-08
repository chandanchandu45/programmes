package exception;
import java.util.Scanner;
public class demo 
{
	static void test(String phnnum)
	{
		if(phnnum.length()==13)
		{
			System.out.println("valid phone number");
		}
		else
		{
			try
			{
				throw new InvalidPhoneNumberException();
			}
			catch(InvalidPhoneNumberException e)
			{
				System.out.println("number should be 13 digits");
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the phone number");
	String phnnum=sc.next();
	test(phnnum);
}
}

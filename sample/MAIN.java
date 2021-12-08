package sample;
import java.util.Scanner;
public class MAIN 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount to be draw");
	double amount=sc.nextDouble();
 saving_account s=new saving_account();
 s.withdraw(amount);
 System.out.println("enter the amount to be deposited");
 double damount=sc.nextDouble();
 s.deposit(damount);
}
}

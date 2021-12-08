package abc;

public class saving_account extends account
{
 double acc_bal=50000;
 void withdraw(double amount)
 {
	 if(amount<=acc_bal)
	 {
		 acc_bal=acc_bal-amount;
		 System.out.println("with draw is sucessfull");
		 System.out.println("account balance is"+acc_bal);
	 }
 }
 void deposit(double amount)
 {
	 acc_bal=acc_bal+amount;
	 System.out.println("ammount is deposited");
	 System.out.println("account balance is"+acc_bal);
 }
}

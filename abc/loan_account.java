package abc;

public class loan_account extends account
{
 double acc_balance=50000;
 void withdraw(double amount)
 {
	 if(amount<=acc_balance)
	 {
		 acc_balance=amount+acc_balance;
		 System.out.println("withdraw is sucess full");
		 System.out.println("account balance is"+acc_balance);
	 }
	 else
	 {
		 System.out.println("insufficient balance");
	 }
 }
 void deposit(double amount)
 {
	 acc_balance=acc_balance-amount;
	 System.out.println("account baklance is"+acc_balance);
 }
}

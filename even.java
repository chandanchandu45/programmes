import java.util.*;
public class even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int x=sc.nextInt();
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		System.out.println(x+"*"+i+"="+x*i);
		sum=sum+(x*i);
	}
	System.out.println(sum);
}
}

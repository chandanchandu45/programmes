package extraction;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String s=sc.next();
		light l=acess.getFactory(s);
		l.switchon();
		l.switchoff();
	}

}

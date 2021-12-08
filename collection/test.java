package collection;
import java.util.Scanner;
import java.util.HashMap;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		String[] a={"123-","216","466"};
		String[] b={"abc","jhkj","adfh"};
		int index=0;
		for(int i=0;i<b.length;i++)
		{
			if(name.equals(b[i]))
			{
				index=i;
			}
		}
System.out.println(a[index]);
}
}

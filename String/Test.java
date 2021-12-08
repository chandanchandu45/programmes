package String;

public class Test {
public static void main(String[] args) {
	String s="my name is chandu";
	s=s.toUpperCase();
	System.out.println(s);
	String[] s1=s.split(" ",5);//split
	for(String a:s1)//for each
	{
		System.out.println(a);
	}
}
}

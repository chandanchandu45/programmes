package abstractc;
import java.util.ArrayList;
import java.util.Collections;
public class list {
	int id;
	String name;
	double marks;
	list(int id,String name,double marks)
	{
		this.marks=marks;
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(30);
	a.add(20);
	a.add(1);
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
}
}

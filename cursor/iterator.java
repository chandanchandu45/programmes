package cursor;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class iterator {
	private int id;
	private String name;
	private double salary;
	iterator(int id,String nsme,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
public static void main(String[] args) {
	LinkedHashSet t= new LinkedHashSet();
	t.add(new iterator(101,"chandu",45000));
	t.add(new iterator(102,"sam",30000));
	t.add(new iterator(103,"abc",10000));
	Iterator it=t.iterator();
	while(it.hasNext())
	{
		Object ob=it.next();
		iterator ite=(iterator)ob;
		System.out.println(ite.id+"\t"+ite.name+"\t"+ite.salary);
	}
	System.out.println(t);
}
 }
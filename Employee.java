
public class Employee {
private int id;
private String name;
private double salary;
public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}
public void setsalary(double salary)
{
	this.salary=salary;
}
public String toString()
{
	return id+"\t"+name+"\t"+salary;
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.setId(101);
	e.setName("chandu");
	e.setsalary(45000);
	Employee e1=new Employee();
	e1.setId(102);
	e1.setName("sam");
	e1.setsalary(30000);
	System.out.println("id"+"\t"+"name"+"\t"+"salary");
	System.out.println(e);
	System.out.println(e1);
}
}

package tostring;

public class student {
	int id;
	String name;
	Double marks;
 student(int id,String name,double marks)
 {
	 this.id=id;
	 this.name=name;
	 this.marks=marks;
 }
public boolean equals(Object obj)
{
	student stu=(student)obj;
	return this.marks==stu.marks;
}
}

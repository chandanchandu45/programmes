package exception;
import java.io.IOException;
public class demo1 {
void a() throws IOException
{
	throw new IOException();
}
void b()throws IOException
{
	a();
}
void c()
{
	try
	{
	b();
	}
catch(Exception e)
{
	System.out.println("exception handled");
}
}
public static void main(String[] args) {
	demo1  d=new demo1();
	d.c();
}
}


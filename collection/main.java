package collection;
import java.util.Scanner;
public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a year");
	int year=sc.nextInt();
	System.out.println("enter a month");
	int month=sc.nextInt();
	int daysinmonth=0;
	if(((year%4==0)&&(year%100!=0))||(year%400==0))
	{
		if(month==2)
		{
			daysinmonth=29;
	}
	 if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			daysinmonth=31;
		}
		else if(month==4 || month==6 || month==9 || month==1)
		{
			daysinmonth=30;
		}
		else
		{
			daysinmonth=28;
		}
	}	
	 System.out.println("number of days in month "+daysinmonth);
	}
}

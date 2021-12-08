package parsing;
public class main 
{
		static void abc()
		{
		try
		{
			int c=10/0;
		System.out.println("0");
		}
		catch (Exception e)
		{
			System.out.println("1");
		}
		finally
		{
			System.out.println("2");
		}
	}
		public static void main(String[] args) {
			abc();
		}
}
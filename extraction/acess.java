package extraction;

public class acess {
	public static light getFactory(String s)
	{
		if(s.equals("tube"))
		{
			return new tubelight();
		}
		else if(s.equals("led"))
		{
			return new ledlight();
		}
		else
		{
			return null;
		}
	}

}

package test_yantra;

public class Hero {
public void message() throws blocked
{
	System.out.println("i love u");
	throw new blocked();
}
public static void main(String[] args) {
	Hero h = new Hero();
	try{
	h.message();
	} catch (blocked e) {
		System.out.println("sorry...");
	}
}
}

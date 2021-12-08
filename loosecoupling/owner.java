package loosecoupling;

public class owner {
	public static void main(String[] args) {
		assistant a=new assistant();
		a.work(new ledLight());//upcasting
		a.work(new tubelight());//upcasting
	}
}

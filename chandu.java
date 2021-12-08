
public class chandu {
public static void main(String[] args) {
	Battery b=new Battery("abc",4500,5);
	Processor p = new Processor("def",5, 25);
	Laptop laptop = new Laptop(50000, b, p);
	System.out.println(laptop);
}
}

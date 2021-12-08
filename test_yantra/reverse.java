package test_yantra;

public class reverse {
	public static void main(String[] args) {
		String s = "abc";
		String dup = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			dup = dup + s.charAt(i);
		}
		if (dup.equals(s)) {
			System.out.println("given String is a palindrome");
		}else
			System.out.println("given string is not a palindrome");
	}
}

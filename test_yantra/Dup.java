package test_yantra;

public class Dup {
	public static void main(String[] args) {
		String s = "aabccgghh";
		char[] ch = s.toCharArray();
		char[] t = new char[ch.length];
		int j = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] != ch[i + 1]) {
				t[j++] = ch[i];
			}
		}
		t[j] = ch[ch.length - 1];
		String a = new String(t);
		System.out.println(a);
	}

}

package test_yantra;

public class Caps {
	public static void main(String[] args) {
		/*
		 * String s = "cHanDan Is buSY"; char[] ch = s.toCharArray(); for (int i
		 * = 0; i < ch.length; i++) { if(i==0 && ch[i]!=' '||ch[i]!=' ' &&
		 * ch[i-1]==' '){ if(ch[i]>='a' && ch[i]<='z') { ch[i]=(char)(ch[i]-32);
		 * } else if(ch[i]>='A' && ch[i]<='Z') { ch[i]=(char)(ch[i]+32); } } }
		 * String st = new String(ch); System.out.println(st);
		 */
		String s = "chandu";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		String st = new String(ch);
		System.out.println(st);
	}
}

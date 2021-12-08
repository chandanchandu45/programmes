package test_yantra;

public class test1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6 };
		int[] temp = new int[a.length];
		int pos = 2;
		int ele = 3;
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == pos) {
				temp[j] = ele;
			} else {
				temp[j] = a[i];
			}
			j++;
		}
		for (int x : temp) {
			System.out.print(x + " ");
		}
	}
}

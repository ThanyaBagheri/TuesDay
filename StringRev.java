package Highlight;

public class StringRev {
	public static void main(String[] args) {
		String res = revStr("apple");
		System.out.println(res); // elppa
	}

	public static String revStr(String str) {
		// TODO your code goes here
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			res += ch;
		}
		return res;
	}
}

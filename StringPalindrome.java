package Highlight;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println(revStr("java")); // avaj
		System.out.println(revStr("python")); // nohtyp
		System.out.println(revStr("javaScript")); // tpircSavaj
		System.out.println("----");
		System.out.println(isPal("anna")); // true
		System.out.println(isPal("civic")); // true
		System.out.println(isPal("apple")); // false
		System.out.println(isPal("level")); // true
		System.out.println(isPal("java")); // false
	}

	/*
	 * 01234 isPalTwo("civic") -> true isPalTwo("apple") -> false
	 */
	public static boolean isPalTwo(String str) {
		for (int start = 0; start < str.length() / 2; start++) {
			int end = str.length() - 1 - start;
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
		}

		return true;
	}

	/*
	 * Return true if str is palindrome. Reading from left to right and right to
	 * left is same
	 * 
	 * isPal("anna") -> true isPal("civic") -> true isPal("apple") -> false
	 * isPal("level") -> true isPal("java") -> false
	 * 
	 * 1. Reverse str 2. compare with original value. If they are same then it is
	 * palindrome otherwise it is not.
	 */
	public static boolean isPal(String str) {
		str = str.toLowerCase();
		String revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			revstr += ch;
		}
		return revstr.equals(str);
	}

	/*
	 * return reverse version of str revStr("java") -> avaj revStr("python") ->
	 * nohtyp revStr("javaScript") -> tpircSavaj
	 */
	public static String revStr(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev += ch;
		}

		return rev;
	}
}

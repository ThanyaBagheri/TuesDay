package Highlight;

public class NumberPalindrome {
	public static void main(String[] args) {
		boolean isPal = isPalNum(303);
		System.out.println(isPal); // true
	}

	   public static boolean isPalNum(int num) {
	    	// your code goes here
		int rev = 0, remainder;
		int e = num;
		
		while(num!=0) {
			remainder = num % 10;
			rev = (rev*10)+ remainder;
			num = num/10;
		}
		
		return e==rev;
	    }
	}



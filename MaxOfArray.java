package Highlight;

public class MaxOfArray {
	public static void main(String[] args) {
	System.out.println(max(new int[] {4, 781, 99, 103})); //781
    // max({1, 2, 3, 4, 5})        -> 5
    // max({3, 4})                 -> 4
    // max({100})                  -> 100
	}
    public static int max(int[] arrNum) {
        // your code goes here
    int max = arrNum[0];
    
    for (int i : arrNum) {
		if (max<i)
			max = i;
	}  
    	return max;
    }
}

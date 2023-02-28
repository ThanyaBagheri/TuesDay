package Highlight;

import java.util.Arrays;

public class SecondMaxMinOfArray {
    public static void main(String[] args) {
        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[] {3, 4})); // 3

        System.out.println("------");
        System.out.println(secMin(new int[] {4, 781, 8, 99, 103})); // 8
        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); // 2
        System.out.println(secMin(new int[] {3, 4})); // 4

        System.out.println("------");
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 1)); // 9
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 2)); // 8
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 3)); // 5
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 100)); // 0
    }


    /**
     * secMax({4, 781, 8, 99, 103})  -> 103
     * secMax({1, 2, 3, 4, 5})       -> 4
     * secMax({3, 4})                -> 3
     *
     * if interviewer allows sorting it will the easiest solution for secondMax and secondMin
     */
    public static int secMax(int[] arr) {
        return 0;
    }

    /**
     * secMin({4, 781, 8, 99, 103})  -> 8
     * secMin({1, 3, 2, 4, 5})       -> 2
     * secMin({3, 4})                -> 4
     *
     * if interviewer allows sorting it will the easiest solution for secondMax and secondMin
     */
    public static int secMin(int[] numArr) {
        return 0;
    }

    /**
     * Return n biggest value from array.
     * if n is out of size of array return 0.
     * n starts with 1.
     * 1 - means the biggest and 2 - second biggest and so on.
     *
     * nMax([4, 3, 2, 8, 9, 5], 1);   -> 9
     * nMax([4, 3, 2, 8, 9, 5], 2);   -> 8
     * nMax([4, 3, 2, 8, 9, 5], 3);   -> 5
     * nMax([4, 3, 2, 8, 9, 5], 100); -> 0
     */
    public static int nMax(int[] arr, int n) {
		return 0;
    }
}

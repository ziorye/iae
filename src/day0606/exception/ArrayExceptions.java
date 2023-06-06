package day0606.exception;

/**
 * 遇到过哪些异常
 */
public class ArrayExceptions {
    public static void main(String[] args) {
        /*
        ArrayIndexOutOfBoundsException
        NullPointerException
         */

        // a.i.o.o.b.e
        int[] arr = new int[10];
        // index from 0 to arr.length -1
        System.out.println(arr[0]);

        // n.p.e
        // demo1
		int[] arr1 = new int[10];
		//arr1 = null;
		System.out.println(arr1[0]);

        // demo2
		int[][] arr2 = new int[3][2];
		System.out.println(arr2[0][1]);

        // Next: md
    }
}

package day0605;

public class TwoDimensionalArrayInMemory2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][];
        arr1[0] = new int[3];
        arr1[1] = new int[]{1, 2, 3};
        arr1[0][2] = 5;
        arr1 = new int[2][];
    }
}

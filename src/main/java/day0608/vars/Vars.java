package day0608.vars;

public class Vars {
    public static void main(String[] args) {
        // int ...
        // myPrint()
        // int[]

        for(String s : args) {
            System.out.println(s);
        }

        //demo(1,2,3,"String", 'c')
        //demo(1,2,3,5,8)
    }

    public static int add(int ... number) {
        System.out.println(number[0]);
        return 0;
    }

    public static void demo(/*int ... ints, */String type, char c) {}
    public static void demo(int type, int c, int ... ii) {}


    /*public static int add(int[] number) {
        return 0;
    }*/
}

package day0608.varTrans;

public class Vtt {
    public static void main(String[] args) {
        //1. 基本数据类型的局部变量
        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n); // m=10 n=10

        m++; // m=11

        System.out.println("m = " + m + ", n = " + n);

        //2. 引用数据类型的局部变量
        //2.1 数组类型
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        arr2[0] = 10;

        System.out.println(arr1[0]);

        //2.2 对象类型
        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1;
        order2.orderId = 1002;

        System.out.println(order1.orderId);

        int a = 8;
        add(a);
        System.out.println(a);
    }

    public static void add(int a) {
        a=9;
        System.out.println(a);
    }
}

class Order {
    int orderId;
}

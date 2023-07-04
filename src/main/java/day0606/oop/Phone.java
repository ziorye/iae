package day0606.oop;

public class Phone {
    // state
    String brand;
    String color;

    // behavior
    void call(String to) {
        System.out.println("我正在打电话给" + to);
    }

    void msg(String to, String content) {
        System.out.println("我把【"+content+"】发给了"+to);
    }
}

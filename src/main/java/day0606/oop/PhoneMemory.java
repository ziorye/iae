package day0606.oop;

public class PhoneMemory {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "华为-update";
        phone1.color = "土金";
        System.out.println(phone1.brand);
        System.out.println(phone1.color);

        Phone phone2 = new Phone();
        phone2.brand = "小米-20";
        phone2.color = "纯黑";
        System.out.println(phone2.brand);
        System.out.println(phone2.color);

        System.out.println(phone1.brand);
    }
}

package day0703.c_super.interview;

/**
 * 判断运行结果
 */
public class Interview02 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
        System.out.println("-----------------");
        s.setInfo("info-update");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
    }
}

class Father {
    private String info = "f-info";

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

class Son extends Father {
    private String info = "s-info";

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}

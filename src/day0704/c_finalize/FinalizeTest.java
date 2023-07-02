package day0704.c_finalize;

/**
 * Object类finalize()方法的使用
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("Andy", 18);
        System.out.println(p);
		/*
		此时对象实体就是垃圾对象，等待被回收。但时间不确定。
		 */
        p = null;
		/*
		强制性释放空间
		 */
        System.gc();
		/*
		Thread.sleep(1000);
		 */
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 此方法调用的时机：当GC要回收此对象时，调用此方法
     * 子类重写此方法，可在释放对象前进行某些操作
     * finalize()可能导致内部出现循环引用，导致此对象不能被回收
     *
     * @throws Throwable throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被释放 ===> " + this);
    }
}


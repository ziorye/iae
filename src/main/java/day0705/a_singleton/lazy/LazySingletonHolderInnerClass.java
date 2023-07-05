package day0705.a_singleton.lazy;

public class LazySingletonHolderInnerClass {

    private LazySingletonHolderInnerClass() {
    }

    private static final class InstanceHolder {
        static final LazySingletonHolderInnerClass INSTANCE = new LazySingletonHolderInnerClass();
    }

    public static LazySingletonHolderInnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }
}

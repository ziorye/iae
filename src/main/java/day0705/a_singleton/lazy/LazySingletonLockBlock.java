package day0705.a_singleton.lazy;

public class LazySingletonLockBlock {
    private static LazySingletonLockBlock INSTANCE;

    private LazySingletonLockBlock() {
    }

    public static LazySingletonLockBlock getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingletonLockBlock.class) {
                INSTANCE = new LazySingletonLockBlock();
            }
        }
        return INSTANCE;
    }
}

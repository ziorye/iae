package day0705.a_singleton.lazy;

public class LazySingletonLock {
    private static LazySingletonLock INSTANCE;

    private LazySingletonLock() {}

    public static synchronized LazySingletonLock getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonLock();
        }
        return INSTANCE;
    }
}

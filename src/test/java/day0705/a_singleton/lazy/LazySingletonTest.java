package day0705.a_singleton.lazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {
    @Test
    void testSingleton() {
        for (int i = 0; i < 3; i++) {
            System.out.println(LazySingleton.getInstance().hashCode());
        }
    }

    /*
    @Test
    void testSingletonWithMultiThread() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(LazySingleton.getInstance().hashCode());
            }).start();
        }
    }
    */
}
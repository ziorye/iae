package day0705.a_singleton.lazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonLockBlockTest {
    @Test
    void testSingletonWithMultiThread() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(LazySingletonLockBlock.getInstance().hashCode());
            }).start();
        }
    }
}
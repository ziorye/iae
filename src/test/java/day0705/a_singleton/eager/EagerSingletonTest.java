package day0705.a_singleton.eager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonTest {
    @Test
    void testSingleton() {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        assertEquals(s1, s2);
    }

    /*
    @Test
    void testSingletonWithMultiThread() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(EagerSingleton.getInstance().hashCode());
            }).start();
        }
    }
     */
}
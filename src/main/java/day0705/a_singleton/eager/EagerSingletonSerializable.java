package day0705.a_singleton.eager;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class EagerSingletonSerializable implements Serializable {
    static final long serialVersionUID = 99L;

    private static final EagerSingletonSerializable INSTANCE = new EagerSingletonSerializable();

    private EagerSingletonSerializable() {
    }

    public static EagerSingletonSerializable getInstance() {
        return INSTANCE;
    }

    Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}

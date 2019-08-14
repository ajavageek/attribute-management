package ch.frankel.blog;

import java.util.UUID;

public class Thing {

    private final UUID uid;

    Thing() {
        uid = UUID.randomUUID();
    }

    @SuppressWarnings("unused")
    public UUID getUid() {
        return uid;
    }
}
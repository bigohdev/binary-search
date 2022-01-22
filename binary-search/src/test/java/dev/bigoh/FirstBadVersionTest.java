package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @BeforeEach
    void setUp() {
        firstBadVersion = new FirstBadVersion();
    }

    @Test
    void firstBadVersion() {
        int exp = 4;
        firstBadVersion.setFirstBadVer(4);
        int acc = firstBadVersion.firstBadVersion(5);
        assert exp == acc;
    }
}
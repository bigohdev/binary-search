package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AggresiveCowsTest {

    private AggresiveCows aggresiveCows;

    @BeforeEach
    void setUp() {
        aggresiveCows = new AggresiveCows();
    }

    @Test
    void isPossible() {
        int expected = 3;
        int actual = aggresiveCows.findMaxMinimum(new int[]{2,5,7,9,14},4);
        assertEquals(expected,actual);
    }
}
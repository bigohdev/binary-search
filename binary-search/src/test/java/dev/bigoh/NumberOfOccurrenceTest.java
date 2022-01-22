package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOccurrenceTest {
    private NumberOfOccurrence numberOfOccurrence ;

    @BeforeEach
    void setUp() {
        numberOfOccurrence = new NumberOfOccurrence();
    }

    @Test
    void driverCode() {
        int exp = 3;
        int acc = numberOfOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},2);
        assert exp == acc;
    }
    @Test
    void driverCodeNotPresent() {
        int exp = 0;
        int acc = numberOfOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},5);
        assert exp == acc;
    }
    @Test
    void driverCodePresentFirst() {
        int exp = 2;
        int acc = numberOfOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},1);
        assert exp == acc;
    }
    @Test
    void driverCodePresentLast() {
        int exp = 1;
        int acc = numberOfOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},4);
        assert exp == acc;
    }
}
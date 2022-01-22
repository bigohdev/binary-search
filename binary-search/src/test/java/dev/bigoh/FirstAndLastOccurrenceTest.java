package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastOccurrenceTest {

    private FirstAndLastOccurrence firstAndLastOccurrence ;

    @BeforeEach
    void setUp() {
        firstAndLastOccurrence = new FirstAndLastOccurrence();
    }

    @Test
    void driverCode() {
        int[] exp = {2,4};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},2);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodeNotPresent() {
        int[] exp = {-1,-1};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},5);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodePresentFirst() {
        int[] exp = {0,1};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},1);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodePresentLast() {
        int[] exp = {6,6};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1,1,2,2,2,3,4},4);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodeSameElements() {
        int[] exp = {0,2};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1,1,1},1);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodeOneElement() {
        int[] exp = {0,0};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1},1);
        assertArrayEquals(exp,acc);
    }
    @Test
    void driverCodeNoElement() {
        int[] exp = {-1,-1};
        int[] acc = firstAndLastOccurrence.driverCode(new int[]{1},2);
        assertArrayEquals(exp,acc);
    }
}
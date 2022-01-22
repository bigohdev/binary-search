package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindPositionTest {

    private FindPosition findPosition;

    @BeforeEach
    void setUp() {
        findPosition = new FindPosition();
    }


    @Test
    void binarySearch() {
        int exp = 7;
        int acc = findPosition.binarySearch(new int[]{7,8,9,10,11,14,18},19);
        assert exp == acc;
    }

    @Test
    void binarySearch1() {
        int exp = 0;
        int acc = findPosition.binarySearch(new int[]{7,8,9,10,11,14,18},5);
        assert exp == acc;
    }

    @Test
    void binarySearch2() {
        int exp = 5;
        int acc = findPosition.binarySearch(new int[]{7,8,9,10,11,14,18},13);
        assert exp == acc;
    }

    @Test
    void binarySearch3() {
        int exp = 2;
        int acc = findPosition.binarySearch(new int[]{7,8,9,10,11,14,18},9);
        assert exp == acc;
    }
}
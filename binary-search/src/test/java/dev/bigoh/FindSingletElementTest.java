package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSingletElementTest {

    private FindSingletElement findSingletElement ;

    @BeforeEach
    void setUp() {
        findSingletElement = new FindSingletElement();
    }

    @Test
    void binarySearch() {
        int exp = 2;
        int acc = findSingletElement.binarySearch(new int[]{1,1,2,3,3,4,4,5,5,6,6});
        assert exp == acc;
    }
    @Test
    void binarySearchTargetAtFirst() {
        int exp = 0;
        int acc = findSingletElement.binarySearch(new int[]{1,2,2,3,3,4,4,5,5,6,6});
        assert exp == acc;
    }
    @Test
    void binarySearchTargetAtLast() {
        int exp = 4;
        int acc = findSingletElement.binarySearch(new int[]{1,1,2,2,6});
        assert exp == acc;
    }
    @Test
    void binarySearchTargetNotFound() {
        int exp = -1;
        int acc = findSingletElement.binarySearch(new int[]{1,1,2,2});
        assert exp == acc;
    }
}
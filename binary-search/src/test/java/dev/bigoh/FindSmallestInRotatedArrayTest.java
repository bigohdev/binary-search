package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestInRotatedArrayTest {

    private FindSmallestInRotatedArray findSmallestInRotatedArray ;

    @BeforeEach
    void setUp() {
        findSmallestInRotatedArray = new FindSmallestInRotatedArray();
    }

    @Test
    void binarySearch() {
        int exp = 4;
        int acc = findSmallestInRotatedArray.binarySearch(new int[]{7,8,9,10,1,2,3});
        assert exp == acc;
    }
    @Test
    void binarySearch1() {
        int exp = 1;
        int acc = findSmallestInRotatedArray.binarySearch(new int[]{3,1});
        assert exp == acc;
    }
    @Test
    void binarySearch2() {
        int exp = 0;
        int acc = findSmallestInRotatedArray.binarySearch(new int[]{1});
        assert exp == acc;
    }

    @Test
    void binarySearch3() {
        int exp = 3;
        int acc = findSmallestInRotatedArray.binarySearch(new int[]{3,4,5,1,2});
        assert exp == acc;
    }

    @Test
    void binarySearch4() {
        int exp = 3;
        int acc = findSmallestInRotatedArray.binarySearch(new int[]{1,2,3,4,5});
        assert exp == acc;
    }
}
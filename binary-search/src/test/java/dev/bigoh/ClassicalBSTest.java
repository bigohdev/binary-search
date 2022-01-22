package dev.bigoh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassicalBSTest {

    private ClassicalBS classicalBS;

    @BeforeEach
    void setUp() {
        classicalBS = new ClassicalBS();
    }


    @Test
    void binarySearch() {
        int exp = 5;
        int acc = classicalBS.binarySearch(new int[]{7,8,9,10,11,14,18},14);
        assert exp == acc;
    }

    @Test
    void binarySearch1() {
        int exp = -1;
        int acc = classicalBS.binarySearch(new int[]{7,8,9,10,11,14,18},12);
        assert exp == acc;
    }

    @Test
    void binarySearch2() {
        int exp = 2;
        int acc = classicalBS.binarySearch(new int[]{7,8,9,10,11,14,18},9);
        assert exp == acc;
    }

    @Test
    void binarySearch3() {
        int exp = -1;
        int acc = classicalBS.binarySearch(new int[]{7,8,9,10,11,14,18},0);
        assert exp == acc;
    }
}
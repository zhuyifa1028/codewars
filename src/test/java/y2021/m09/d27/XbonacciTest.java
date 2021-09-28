package y2021.m09.d27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XbonacciTest {

    @Test
    public void test0() {
        assertArrayEquals(new double[0], Xbonacci.tribonacci(new double[]{1, 1, 1}, 0));
    }

    @Test
    public void test1() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, Xbonacci.tribonacci(new double[]{1, 1, 1}, 10));
    }

    @Test
    public void test2() {
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, Xbonacci.tribonacci(new double[]{0, 0, 1}, 10));
    }

    @Test
    public void test3() {
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, Xbonacci.tribonacci(new double[]{0, 1, 1}, 10));
    }
}
package y2021.m10.d28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightSortTest {

    @Test
    public void test1() {
        assertEquals("2000 103 123 4444 99", WeightSort.exec(" 103  123 4444 99 2000"));
    }

    @Test
    public void test2() {
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.exec(" 2000  10003 1234000 44444444 9999 11 11 22 123"));
    }
}
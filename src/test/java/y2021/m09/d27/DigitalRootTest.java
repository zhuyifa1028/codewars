package y2021.m09.d27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    public void Test1() {
        assertEquals(7, DigitalRoot.calculate(16));
    }

    @Test
    public void Test2() {
        assertEquals(6, DigitalRoot.calculate(456));
    }

}
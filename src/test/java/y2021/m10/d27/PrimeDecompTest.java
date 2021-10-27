package y2021.m10.d27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeDecompTest {

    @Test
    public void test1() {
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
    }
}
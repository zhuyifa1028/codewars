package y2021.m10.d20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    public void testBasic() {
        assertTrue(Prime.isPrime(2), "2  is prime");
        assertTrue(Prime.isPrime(73), "73 is prime");
        assertFalse(Prime.isPrime(0), "0  is not prime");
        assertFalse(Prime.isPrime(1), "1  is not prime");
        assertFalse(Prime.isPrime(75), "75 is not prime");
        assertFalse(Prime.isPrime(-1), "-1 is not prime");
    }

    @Test
    public void testPrime() {
        assertTrue(Prime.isPrime(3), "3 is prime");
        assertTrue(Prime.isPrime(5), "5 is prime");
        assertTrue(Prime.isPrime(7), "7 is prime");
        assertTrue(Prime.isPrime(41), "41 is prime");
        assertTrue(Prime.isPrime(5099), "5099 is prime");
    }

    @Test
    public void testNotPrime() {
        assertFalse(Prime.isPrime(4), "4 is not prime");
        assertFalse(Prime.isPrime(6), "6 is not prime");
        assertFalse(Prime.isPrime(8), "8 is not prime");
        assertFalse(Prime.isPrime(9), "9 is not prime");
        assertFalse(Prime.isPrime(45), "45 is not prime");
        assertFalse(Prime.isPrime(-5), "-5 is not prime");
        assertFalse(Prime.isPrime(-8), "-8 is not prime");
        assertFalse(Prime.isPrime(-41), "-41 is not prime");
    }
}
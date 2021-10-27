package y2021.m10.d27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @Test
    public void test1() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    }

    @Test
    public void test2() {
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
package y2021.m09.d27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DubstepTest {

    @Test
    public void test1() {
        assertEquals("ABC", Dubstep.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void test2() {
        assertEquals("R L", Dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }

}
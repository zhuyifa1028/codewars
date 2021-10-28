package y2021.m10.d28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

    @Test
    public void test1() {
        assertEquals("TestCase", CamelCase.exec("test case"));
    }

    @Test
    public void test2() {
        assertEquals("CamelCaseMethod", CamelCase.exec("camel case method"));
    }

    @Test
    public void test3() {
        assertEquals("CamelCaseWord", CamelCase.exec(" camel case word"));
    }

    @Test
    public void test4() {
        assertEquals("SayHello", CamelCase.exec("say hello "));
    }

    @Test
    public void test5() {
        assertEquals("Z", CamelCase.exec("z"));
    }

    @Test
    public void test6() {
        assertEquals("AbC", CamelCase.exec("ab  c"));
    }

    @Test
    public void test7() {
        assertEquals("", CamelCase.exec(""));
    }
}
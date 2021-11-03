package y2021.m10.d29;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PaginationHelperTest {

    PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

    @Test
    public void test1() {
        System.out.println("test itemCount");
        assertEquals(6, helper.itemCount());
    }

    @Test
    public void test2() {
        System.out.println("test pageCount");
        assertEquals(2, helper.pageCount());
    }

    @Test
    public void test3() {
        System.out.println("test pageItemCount");
        assertEquals(4, helper.pageItemCount(0));
        assertEquals(2, helper.pageItemCount(1));
        assertEquals(-1, helper.pageItemCount(2));
    }

    @Test
    public void test4() {
        System.out.println("test pageIndex");
        assertEquals(0, helper.pageIndex(2));
        assertEquals(1, helper.pageIndex(5));
        assertEquals(-1, helper.pageIndex(20));
        assertEquals(-1, helper.pageIndex(-10));
    }

}
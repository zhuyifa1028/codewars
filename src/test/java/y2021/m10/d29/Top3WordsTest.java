package y2021.m10.d29;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Top3WordsTest {

    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("e", "d", "a"), Top3Words.exec("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), Top3Words.exec("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"), Top3Words.exec("  //wont won't won't "));
        assertEquals(Collections.singletonList("e"), Top3Words.exec("  , e   .. "));
        assertEquals(Collections.emptyList(), Top3Words.exec("  ...  "));
        assertEquals(Collections.emptyList(), Top3Words.exec("  '  "));
        assertEquals(Collections.emptyList(), Top3Words.exec("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"), Top3Words.exec(String.join("\n",
                "In a village of La Mancha, the name of which I have no desire to call to",
                "mind, there lived not long since one of those gentlemen that keep a lance",
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                "coursing. An olla of rather more beef than mutton, a salad on most",
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                "on Sundays, made away with three-quarters of his income.")));
    }
}
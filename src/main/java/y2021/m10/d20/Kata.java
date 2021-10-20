package y2021.m10.d20;

import java.util.stream.IntStream;

/**
 * 创建电话号码
 *
 * @author zhuyifa
 * @version 2021/10/20
 */
public class Kata {

    /**
     * 编写一个接受10个整数（0-9之间）的数组的函数，以电话号码的形式返回这些数字的字符串。
     * <p>
     * 例子
     * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => 返回"(123) 456-7890"
     * <p>
     * 返回的格式必须正确，才能完成这个挑战。
     * 不要忘记括号后面的空格!
     *
     * @param numbers 10个整数（0-9之间）的数组
     * @return 电话号码
     */
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}

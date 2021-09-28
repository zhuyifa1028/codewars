package y2021.m09.d27;

/**
 * 数字根
 */
public class DigitalRoot {

    /**
     * 数字根是一个数中所有数字的递归和。
     * <p>
     * 给定 n，取 n 的数字之和。 如果该值超过一位，则继续以这种方式减少，直到产生一位数。 输入将是一个非负整数。
     * <p>
     * 例子
     * 16 --> 1 + 6 = 7
     * 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
     * 132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
     * 493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2
     *
     * @param n 一个非负整数
     * @return 数字根
     */
    public static int calculate(int n) {
        return (n - 1) % 9 + 1;
    }

}
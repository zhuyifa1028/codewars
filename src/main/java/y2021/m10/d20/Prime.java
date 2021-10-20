package y2021.m10.d20;

import java.math.BigInteger;

/**
 * 判断一个数字是不是质数
 *
 * @author zhuyifa
 * @version 2021/10/20
 */
public class Prime {

    /**
     * 定义一个函数，该函数接收一个整数参数，并根据该整数是否为素数返回逻辑值true或false。
     * <p>
     * 根据维基百科，质数（或素数）是一个大于1的自然数，除了1和它本身之外没有正除数。
     * <p>
     * 要求
     * 你可以假设你会得到一个整数的输入。
     * 你不能假设这个整数只有正数。你也可以给你负数（或0）。
     * 注意性能问题。没有花哨的优化要求，但最微不足道的解决方案可能会超时。数字最高可达2^31（或类似，取决于语言版本）。一路循环到n，或n/2，会太慢。
     * <p>
     * 例如
     * is_prime(1) => false
     * is_prime(2) => true
     * is_prime(-1) => false
     *
     * @param num 整数
     * @return true或false
     */
    public static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

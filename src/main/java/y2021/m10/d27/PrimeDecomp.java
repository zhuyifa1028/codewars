package y2021.m10.d27;

/**
 * 数字中的素数
 *
 * @author zhuyifa
 * @version 2021/10/27
 */
public class PrimeDecomp {

    /**
     * 给定正数 n > 1 找到 n 的主要因子分解。结果将是具有以下形式的字符串：
     * "(p1**n1)(p2**n2)...(pk**nk)"
     * 使用p(i)增加顺序，如果n(i)为1，则为n(i)空。
     * <p>
     * 示例：n = 86240 应该返回 "(2**5)(5)(7**2)(11)"
     *
     * @param n 正数
     * @return 主要因子分解
     */
    public static String factors(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int j = 0;
            while (n % i == 0) {
                n = n / i;
                j++;
            }

            if (j == 1) {
                sb.append(String.format("(%d)", i));
            } else if (j > 1) {
                sb.append(String.format("(%d**%d)", i, j));
            }
        }
        return sb.toString();
    }
}

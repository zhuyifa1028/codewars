package y2021.m09.d27;

/**
 * 计数重复
 */
public class CountingDuplicates {

    /**
     * 计算重复的数量
     * 编写一个函数，该函数将返回在输入字符串中出现多次的不同的不区分大小写的字母字符和数字的计数。 可以假定输入字符串仅包含字母（大写和小写）和数字。
     * <p>
     * 例子
     * "abcde" -> 0 # 没有字符重复多次
     * "aabbcde" -> 2 # 'a' 和 'b'
     * "aabBcde" -> 2 # 'a' 出现两次，'b' 出现两次（`b` 和 `B`）
     * "indivisibility" -> 1 # 'i' 出现六次
     * "Indivisibilities" -> 2 # 'i' 出现七次，'s' 出现两次
     * "aA11" -> 2 # 'a' 和 '1'
     * "ABBA" -> 2 # 'A' 和 'B' 各出现两次
     *
     * @param text 有重复字符的字符串
     * @return 重复字符的数量
     */
    public static int duplicateCount(String text) {
        text = text.toLowerCase();

        String s;
        int count = 0;
        while (text.length() > 0) {
            s = text.substring(0, 1);
            text = text.substring(1);

            if (text.contains(s)) {
                count++;
                text = text.replace(s, "");
            }
        }
        return count;
    }
}

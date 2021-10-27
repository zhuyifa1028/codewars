package y2021.m10.d27;

/**
 * 简单的拉丁语
 *
 * @author zhuyifa
 * @version 2021/10/27
 */
public class PigLatin {

    /**
     * 将每个单词的第一个字母移动到它的末尾，然后将“ay”添加到单词的末尾。 保持标点符号不受影响。
     * <p>
     * 例子
     * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
     * pigIt('Hello world !');     // elloHay orldway !
     *
     * @param str 输入字符串
     * @return 变更后的字符串
     */
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}

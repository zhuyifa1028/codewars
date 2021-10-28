package y2021.m10.d28;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 权重排序
 *
 * @author zhuyifa
 * @version 2021/10/28
 */
public class WeightSort {

    /**
     * 我的朋友约翰和我是“减肥俱乐部”（FFC）的成员。约翰很担心，因为每个月都会公布一份包含会员体重的名单，每个月他都是名单上的最后一个，这意味着他是最重的。
     * 我是建立名单的人，所以我告诉他：“别担心，我会修改名单的顺序。”。决定对数字赋予“权重”。从现在起，数字的权重将取决于其数字之和。
     * 例如，99的“权重”为18，100的“权重”为1，因此列表中100将位于99之前。
     * 给定一个按正常顺序排列FFC成员权重的字符串，您能按这些数字的“权重”排列该字符串吗？
     * <p>
     * 例子：
     * “56 65 74 100 99 68 86 180 90”按数字的权重排序变为："100 180 90 56 65 74 68 86 99"
     * <p>
     * 当两个数字具有相同的“权重”时，让我们将它们分类，就像它们是字符串（按字母顺序排列）而不是数字一样：
     * 180在90之前，因为具有相同的“权重”（9），它以字符串的形式出现在前面。
     * 列表中的所有数字都是正数，列表可以为空。
     * <p>
     * 笔记
     * 输入字符串可能具有前导空格、尾随空格以及两个连续数字之间的多个唯一空格
     * 对于C：结果被释放。
     *
     * @param str 输入字符串
     * @return 排序后的字符串
     */
    public static String exec(String str) {
        return Arrays.stream(str.trim().split("\\s+")).sorted((a, b) -> {
            int s1 = a.chars().map(Character::getNumericValue).sum();
            int s2 = b.chars().map(Character::getNumericValue).sum();
            return s1 == s2 ? a.compareTo(b) : s1 - s2;
        }).collect(Collectors.joining(" "));
    }
}

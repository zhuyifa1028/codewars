package y2021.m10.d29;

// 编写一个函数，在给定一个文本字符串（可能带有标点和换行符）的情况下，按出现次数的降序返回前三位最常出现的单词的数组。
// 假设：
//  - 单词是一组字母（A到Z），可选地包含ASCII中的一个或多个撇号（'）。
//  - 撇号可以出现在单词的开头、中间或结尾（’abc、abc‘、’abc‘、ab'c都是有效的）
//  - 任何其他字符(如#、\、/、…)都不是单词的一部分，应视为空白。
//  - 匹配项应不区分大小写，结果中的单词应小写。
//  - 领带可以任意断开。
//  - 如果文本包含的唯一单词少于三个，则应返回前2个或前1个单词，如果文本不包含单词，则返回空数组。
// 示例：
//  top_3_words("In a village of La Mancha, the name of which I have no desire to call to
//  mind, there lived not long since one of those gentlemen that keep a lance
//  in the lance-rack, an old buckler, a lean hack, and a greyhound for
//  coursing. An olla of rather more beef than mutton, a salad on most
//  nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
//  on Sundays, made away with three-quarters of his income.")
//  # => ["a", "of", "on"]
//
//  top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
//  # => ["e", "ddd", "aa"]
//
//  top_3_words("  //wont won't won't")
//  # => ["won't", "wont"]
// 对于java用户，调用的形式实际上是：TopWords.top3（strings），希望您返回一个列表<String>。
//
// 奖励积分（不是真的，只是为了好玩）：
//  1. 避免创建内存占用量与输入文本大致相同的数组。
//  2. 避免对唯一单词的整个数组进行排序。

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 文本中最常用的3个单词
 *
 * @author zhuyifa
 * @version 2021/10/28
 */
public class Top3Words {

    public static List<String> exec(String s) {
        return Arrays.stream(s.toLowerCase().split("[^a-z*|']"))
                .filter(o -> !o.isEmpty() && !o.replace("'", "").isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

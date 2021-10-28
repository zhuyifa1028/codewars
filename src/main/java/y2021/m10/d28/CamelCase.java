package y2021.m10.d28;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 驼峰法
 *
 * @author zhuyifa
 * @version 2021/10/28
 */
public class CamelCase {

    /**
     * 为字符串编写simple.camelCase方法（PHP中的camel_case函数、C#中的camelCase或Java中的camelCase）。所有单词的第一个字母都必须大写，不带空格。
     * 例如：
     * camelCase("hello case"); // => "HelloCase"
     * camelCase("camel case word"); // => "CamelCaseWord"
     *
     * @param str 输入字符串
     * @return 转化成驼峰的字符串
     */
    public static String exec(String str) {
        str = str.trim();
        if ("".equals(str)) {
            return "";
        }
        return Arrays.stream(str.split("\\s+")).map(a -> {
            char[] chars = a.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            return String.valueOf(chars);
        }).collect(Collectors.joining(""));
    }
}

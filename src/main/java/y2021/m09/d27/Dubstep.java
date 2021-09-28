package y2021.m09.d27;

/**
 * Dubstep音乐
 */
public class Dubstep {

    /**
     * Polycarpus 在最好的 Berland 夜总会担任 DJ，他的表演中经常使用 dubstep 音乐。最近，他决定采用几首老歌并从中制作dubstep混音。
     * <p>
     * 假设一首歌包含一定数量的单词（不包含 WUB）。为了对这首歌进行dubstep混音，Polycarpus在歌曲的第一个单词之前（数字可能为零），最后一个单词之后（数字可能为零）和单词之间插入了一定数量的单词“WUB”（任何一对相邻单词之间至少有一个），然后男孩将所有单词（包括“WUB”）粘在一根弦上，然后在俱乐部演奏这首歌。
     * <p>
     * 例如，带有“I AM X”字样的歌曲可以转换为“WUBWUBIWUBAMWUBWUBX”的dubstep混音，而不能转换为“WUBWUBIAMWUBX”。
     * <p>
     * 最近，Jonny 听到了 Polycarpus 的新 dubstep 曲目，但由于他不喜欢现代音乐，他决定找出 Polycarpus 混音的最初歌曲是什么。帮助乔尼恢复原曲。
     * <p>
     * 输入
     * 输入由单个非空字符串组成，仅由大写英文字母组成，字符串长度不超过200个字符
     * <p>
     * 输出
     * 返回 Polycarpus 用来制作 dubsteb 混音的初始歌曲的歌词。用空格分隔单词。
     * <p>
     * 例子
     * SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
     * // => WE ARE THE CHAMPIONS MY FRIEND
     *
     * @param song 非空字符串
     * @return 初始歌曲的歌词
     */
    public static String songDecoder(String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}

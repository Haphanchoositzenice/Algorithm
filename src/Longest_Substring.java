public class Longest_Substring {
    public int longestSubstring(String s) {
    int len = s.length();
    if(len == 0) return 0;
    int max = 1;
    return max; //not yet
    }

    public static void main(String[] args) {
        Longest_Substring ls = new Longest_Substring();
        System.out.println(ls.longestSubstring("abcabcbb"));
    }
}
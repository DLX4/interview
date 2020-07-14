//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        // 借助map标记重复字符的位置
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0, start = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);

            if (map.containsKey(cur)) {
                // 当前end位置字符重复 区间[start,end)
                // result = Math.max(result, i - start);
                // 更新滑动窗口，start = 上一次该字符出现的位置+1
                int lastCurIndex = map.get(cur) + 1;
                while (start < lastCurIndex) {
                    map.remove(s.charAt(start));
                    start++;
                }
                // System.out.println("[" + start + " " + i + "]");
            } else {
                // 当前end位置字符不重复 区间[start,end]
                result = Math.max(result, i - start + 1);
                // System.out.println(result);
                // System.out.println("[" + start + " " + i + "]");
            }

            // 标记字符位置(最近一次出现)
            map.put(cur, i);
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

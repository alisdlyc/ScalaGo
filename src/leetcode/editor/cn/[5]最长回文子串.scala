//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2666 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def longestPalindrome(s: String): String = {
        val len = s.length
        if (len < 2) {
            return s
        }

        var maxlen = 1
        var begin = 0

        val dp = Array.ofDim[Boolean](len, len)
        val charArray = s.toCharArray

        // init
        for (i <- 0 until len) {
            dp(i)(i) = true
        }
        for (j <- 0 until len) {
            for (i <- 0 until len) {
                if (charArray(i) != charArray(j)) {
                    dp(i)(j) = false
                } else {
                    if (j - i < 3) {
                        dp(i)(j) = true
                    } else {
                        dp(i)(j) = dp(i+1)(j-1)
                    }
                }

                if (dp(i)(j) && j-i+1 >maxlen) {
                    maxlen = j-i+1
                    begin = i
                }
            }
        }
        s.substring(begin, begin+maxlen)
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

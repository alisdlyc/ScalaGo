//一条包含字母 A-Z 的消息通过以下方式进行了编码： 
//
// 'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
// 
//
// 给定一个只包含数字的非空字符串，请计算解码方法的总数。 
//
// 示例 1: 
//
// 输入: "12"
//输出: 2
//解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
// 
//
// 示例 2: 
//
// 输入: "226"
//输出: 3
//解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
// 
// Related Topics 字符串 动态规划 
// 👍 489 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def numDecodings(s: String): Int = {

        val len = s.length
        if (len == 0) {
            return 0
        }
        val dp = new Array[Int](len)
        val charArray = s.toCharArray

        if (charArray(0) == '0') {
            return 0
        }
        dp(0) = 1;

        for (i <- 1 until len) {
            if (charArray(i) != '0') {
                dp(i) = dp(i-1)
            }

            val num = 10 * (charArray(i-1) - '0') + (charArray(i) - '0');
            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp(i) += 1
                } else {
                    dp(i) += dp(i-2)
                }
            }
        }
        dp(len-1)

    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

//给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。 
//
// 示例 1: 
//
// 输入: n = 12
//输出: 3 
//解释: 12 = 4 + 4 + 4. 
//
// 示例 2: 
//
// 输入: n = 13
//输出: 2
//解释: 13 = 4 + 9. 
// Related Topics 广度优先搜索 数学 动态规划 
// 👍 576 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def numSquares(n: Int): Int = {
        val coins = new Array[Int](n)
        for (i <- 1 until n/2 if(i <= n )) {
            coins.apply(i)
        }

        val len = coins.length
        if (len == 0 || n < 0) {
            return -1
        }
        if (n == 0) {
            return 0
        }
        var dp = new Array[Int](n+1)
        for (i <- dp.indices) {
            dp(i) = -1
        }
        for (i <- 0 until len) {
            if (coins(i) == n) {
                return 1
            }
            if (coins(i) < n) {
                dp(coins(i)) = 1
            }
        }
        for (i <- 1 until n + 1) {
            for (j <- 0 until len) {
                if (i-coins(j)>=0 && dp(i-coins(j))!= -1) {
                    if (dp(i) == -1 || dp(i) > dp(i-coins(j)) + 1) {
                        dp(i) = dp(i-coins(j)) + 1
                    }
                }
            }
        }
        dp(n)
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

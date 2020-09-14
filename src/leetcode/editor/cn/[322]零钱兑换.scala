//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回
// -1。 
//
// 
//
// 示例 1: 
//
// 输入: coins = [1, 2, 5], amount = 11
//输出: 3 
//解释: 11 = 5 + 5 + 1 
//
// 示例 2: 
//
// 输入: coins = [2], amount = 3
//输出: -1 
//
// 
//
// 说明: 
//你可以认为每种硬币的数量是无限的。 
// Related Topics 动态规划 
// 👍 790 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        val len = coins.length
        if (len == 0 || amount < 0) {
            return -1
        }
        if (amount == 0) {
            return 0
        }
        var dp = new Array[Int](amount+1)
        for (i <- dp.indices) {
            dp(i) = -1
        }
        for (i <- 0 until len) {
            if (coins(i) == amount) {
                return 1
            }
            if (coins(i) < amount) {
                dp(coins(i)) = 1
            }
        }
        for (i <- 1 until amount + 1) {
            for (j <- 0 until len) {
                if (i-coins(j)>=0 && dp(i-coins(j))!= -1) {
                    if (dp(i) == -1 || dp(i) > dp(i-coins(j)) + 1) {
                        dp(i) = dp(i-coins(j)) + 1
                    }
                }
            }
        }
        dp(amount)
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

//你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋
//装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。 
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。 
//
// 示例 1: 
//
// 输入: [2,3,2]
//输出: 3
//解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
// 
//
// 示例 2: 
//
// 输入: [1,2,3,1]
//输出: 4
//解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
//     偷窃到的最高金额 = 1 + 3 = 4 。 
// Related Topics 动态规划 
// 👍 363 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def rob(nums: Array[Int]): Int = {
        val len = nums.length
        if (len == 0) {
            0
        } else if (len <= 1) {
            nums(0)
        } else {
            // init
            val dp = Array.ofDim[Int](2, len)
            // 偷第一个
            dp(1)(0) = nums(0)
            for (i <- 1 until len-1) {
                dp(0)(i) = Math.max(dp(0)(i-1), dp(1)(i-1))
                dp(1)(i) = dp(0)(i-1) + nums(i)
            }
            var max = Math.max(dp(0)(len-2), dp(1)(len-2))

            dp(1)(0) = 0
            // 偷最后一个
            for (i <- 1 until len) {
                dp(0)(i) = Math.max(dp(0)(i-1), dp(1)(i-1))
                dp(1)(i) = dp(0)(i-1) + nums(i)
            }

            Math.max(max, Math.max(dp(0)(len-1), dp(1)(len-1)))
        }
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

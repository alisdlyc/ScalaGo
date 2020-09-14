//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 2362 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        var len = nums.length
        var dp = new Array[Int](len)

        if (len <= 0) {
            0
        }
        dp(0) = nums(0)
        if (len <= 1) {
            dp(0)
        } else {
            for (i <- 1 until len) {
                dp(i) = Math.max(dp(i-1)+nums(i), nums(i))
            }
            dp.max
        }
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

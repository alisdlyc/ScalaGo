//给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 
//
// 说明：每次只能向下或者向右移动一步。 
//
// 示例: 
//
// 输入:
//[
//  [1,3,1],
//  [1,5,1],
//  [4,2,1]
//]
//输出: 7
//解释: 因为路径 1→3→1→1→1 的总和最小。
// 
// Related Topics 数组 动态规划 
// 👍 650 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
        var m = grid.length
        var n = grid(0).length
        if (m <= 0 || n <= 0) {
            0
        }
        var dp = Array.ofDim[Int](m, n)
        // init
        dp(0)(0) = grid(0)(0)
        for (i <- 1 until m) {
            dp(i)(0) = dp(i-1)(0) + grid(i)(0)
        }
        for (j <- 1 until n) {
            dp(0)(j) = dp(0)(j-1) + grid(0)(j)
        }
        for (i <- 1 until m) {
            for (j <- 1 until n) {
                dp(i)(j) = Math.min(dp(i-1)(j), dp(i)(j-1)) + grid(i)(j)
            }
        }
        dp(m-1)(n-1)
    }
}*/
//leetcode submit region end(Prohibit modification and deletion)

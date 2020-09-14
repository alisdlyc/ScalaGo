//在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。 
//
// 示例: 
//
// 输入: 
//
//1 0 1 0 0
//1 0 1 1 1
//1 1 1 1 1
//1 0 0 1 0
//
//输出: 4 
// Related Topics 动态规划 
// 👍 535 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
  def maximalSquare(matrix: Array[Array[Char]]): Int = {
    if (matrix.length <= 0 || matrix(0).length <= 0) {
      return 0
    }
    val m = matrix.length
    val n = matrix(0).length
    val dp = Array.ofDim[Int](m + 1, n + 1)
    var max = 0

    for (i <- 1 to m) {
      for (j <- 1 to n) {
        if (matrix(i - 1)(j - 1).equals('1')) {
          dp(i)(j) = Math.min(Math.min(dp(i - 1)(j), dp(i)(j - 1)), dp(i - 1)(j - 1)) + 1
          max = Math.max(max, dp(i)(j))
        }
      }
    }
    max * max
  }
}*/

//leetcode submit region end(Prohibit modification and deletion)

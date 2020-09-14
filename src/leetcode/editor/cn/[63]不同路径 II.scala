//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。 
//
// 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？ 
//
// 
//
// 网格中的障碍物和空位置分别用 1 和 0 来表示。 
//
// 说明：m 和 n 的值均不超过 100。 
//
// 示例 1: 
//
// 输入:
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//输出: 2
//解释:
//3x3 网格的正中间有一个障碍物。
//从左上角到右下角一共有 2 条不同的路径：
//1. 向右 -> 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右 -> 向右
// 
// Related Topics 数组 动态规划 
// 👍 400 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*object Solution {
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid(0).length
    if (m <= 0 || n <= 0 || obstacleGrid(m - 1)(n - 1) == 1 || obstacleGrid(0)(0) == 1) {
      return 0
    }

    val dp = Array.ofDim[Int](m, n)
    var flag = true
    for (i <- 0 until m if flag) {
      if (obstacleGrid(i)(0) == 0) {
        dp(i)(0) = 1
      } else {
        flag = false
      }
    }

    flag = true
    for (j <- 0 until n if flag) {
      if (obstacleGrid(0)(j) == 0) {
        dp(0)(j) = 1
      } else {
        flag = false
      }
    }

    for (i <- 1 until m) {
      for (j <- 1 until n) {
        if(obstacleGrid(i)(j) == 1) {
          dp(i)(j) = 0
        } else (
          dp(i)(j) = dp(i-1)(j) + dp(i)(j-1)
        )
      }
    }
    dp(m - 1)(n - 1)
  }
}*/

//leetcode submit region end(Prohibit modification and deletion)

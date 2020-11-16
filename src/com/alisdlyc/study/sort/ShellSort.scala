package com.alisdlyc.study.sort

object ShellSort {
  def main(args: Array[String]): Unit = {
    //创建一个80000个随机数据的数组
    val random = new util.Random()
    val arr = new Array[Int](8)
    for (i <- 0 until 8) {
      arr(i) = random.nextInt(8)
    }
    println(shellSort(arr).mkString(" "))
  }

  def shellSort(array: Array[Int]): Array[Int] = {
    val n = array.length
    var gap = n / 2

    while (gap > 0) {
      for (i <- gap until n) {
        var temp = array(i)
        var j = i
        // 插入排序
        while (j >= 0 && j - gap >= 0 && array(j - gap) > temp) {
          array(j) = array(j - gap)
          j -= gap
        }
        array(j) = temp
      }

      gap = (gap / 2)
    }
    array
  }
}

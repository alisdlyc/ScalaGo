package com.alisdlyc.study.sort

import java.text.SimpleDateFormat
import java.util.Date

object SelectSort {
  def main(args: Array[String]): Unit = {
    //创建一个80000个随机数据的数组
    val random = new util.Random()
    val arr = new Array[Int](80000)
    for (i <- 0 until 80000) {
      arr(i) = random.nextInt(8000000)
    }
    println("排序前")
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("排序前时间=" + date) //输出时间
    println("排序后")
    selectSort(arr)
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("排序后时间=" + date2) //输出时间
  }

  def selectSort(array: Array[Int]): Unit = {
    for (i <- array.indices) {
      var min = array(i)
      var minIndex = i

      for (j <- i + 1 until array.length) {
        if (min > array(j)) {
          min = array(j)
          minIndex = j
        }
      }
      // 判断是否需要交换
      if (minIndex != i) {
        array(minIndex) = array(i)
        array(i) = min
      }
    }
  }
}

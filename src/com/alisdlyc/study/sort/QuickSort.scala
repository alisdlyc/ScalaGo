package com.alisdlyc.study.sort

import java.text.SimpleDateFormat
import java.util.Date

import scala.util.control.Breaks.{break, breakable}

object QuickSort {
  def main(args: Array[String]): Unit = {
    //创建一个80000个随机数据的数组
    val random = new util.Random()
    val arr = new Array[Int](80000000)
    for (i <- 0 until 80000000) {
      arr(i) = random.nextInt(80000000)
    }
    println("排序前")
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("排序前时间=" + date) //输出时间
    println("排序后")
    quickSort(0, arr.length - 1, arr)
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("排序后时间=" + date2) //输出时间
  }

  /**
   * @param left :指定数组左边的下标 0
   * @param right :指定数组右边的下标 length - 1
   * @param arr: 要排序的数组
   * */
  def quickSort(left: Int, right: Int, arr: Array[Int]): Unit = {
    var l = left
    var r = right
    var pivot = arr((left + right) / 2)
    var temp = 0
    breakable {
      // while的作用是把比pivot小的数放到左边，比pivot大的数放到右边
      while (l < r) {
        // 从左边找一个比 pivot 小的下标
        while (arr(l) < pivot) {
          l += 1
        }
        // 从右边找一个比 pivot 大的下标
        while (arr(r) > pivot) {
          r -= 1
        }
        if (l >= r) {
          break()
        }
        var temp = arr(l)
        arr(l) = arr(r)
        arr(r) = temp
        if (arr(l) == pivot) {
          r -= 1
        }
        if ((arr(r)) == pivot) {
          l += 1
        }
      }
    }
    if (l == r) {
      l += 1
      r -= 1
    }
    if (left < r) {
      quickSort(left, r, arr)
    }
    if (right > l) {
      quickSort(l, right, arr)
    }
  }
}

package com.alisdlyc.study.sort

import java.text.SimpleDateFormat
import java.util.Date

object MergeSort {
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
    val temp = new Array[Int](arr.length)
    mergeSort(arr, 0, arr.length - 1, temp)
    val now2: Date = new Date()
    val date2 = dateFormat.format(now2)
    println("排序后时间=" + date2) //输出时间
  }

  def mergeSort(arr: Array[Int], left: Int, right: Int, temp: Array[Int]): Unit = {
    if (left < right) {
      val mid = (left + right) / 2
      mergeSort(arr, left, mid, temp) // 递归将左边的数组做成有序列表
      mergeSort(arr, mid + 1, right, temp)
      merge(arr, left, mid, right, temp)
    }
  }

  def merge(arr: Array[Int], left: Int, mid: Int, right: Int, temp: Array[Int]) {
    // i是左边的索引， j是右边的索引， t是temp数组的索引
    var i = left
    var j = mid + 1
    var t = 0
    while (i <= mid && j <= right) {
      if (arr(i) <= arr(j)) {
        // 如果是当前的左边的有序列表的值，小于当前的右边的有序列表的值
        // 就把这个值拷贝到temp数组
        temp(t) = arr(i)
        t += 1
        i += 1
      } else {
        // 如果是当前的右边的有序列表的值，小于当前的左边的有序列表的值
        // 就把这个值拷贝到temp数组
        temp(t) = arr(j)
        t += 1
        j += 1
      }
    }
    while (i <= mid) {
      // 如果左边列表还有剩余数据就依次拷贝到temp数组
      temp(t) = arr(i)
      t += 1
      i += 1
    }
    while (j <= right) {
      // 如果右边列表还有剩余数据，就依次拷贝到temp数组
      temp(t) = arr(j)
      t += 1
      j += 1
    }

    // 下面的代码完成将本次的temp的数组拷贝到arr中
    t = 0
    var tempLeft = left
    while (tempLeft <= right) {
      arr(tempLeft) = temp(t)
      t += 1
      tempLeft += 1
    }
  }
}

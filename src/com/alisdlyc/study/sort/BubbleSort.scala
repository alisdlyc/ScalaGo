package com.alisdlyc.study.sort

import java.text.SimpleDateFormat
import java.util.Date

object BubbleSort {
  def main(args: Array[String]): Unit = {
    //数组
    //val arr = Array(3, 9, -1, 10, 20)
    val arr = Array(1, 5, 6, -1, 0, 32)
    bubbleSort(arr)
    println(arr.mkString("-"))
  }


  def bubbleSort(arr: Array[Int]): Unit = {
    for (i <- 0 until arr.length - 1) {
      for (j <- 0 until arr.length - 1 - i) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j+1)
          arr(j + 1) = arr(j)
          arr(j) = temp
        }
      }
      println(arr.mkString(" "))
    }
  }
}

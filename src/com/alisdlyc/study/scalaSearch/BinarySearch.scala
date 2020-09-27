package com.alisdlyc.study.scalaSearch

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks.{break, breakable}

object BinarySearch {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 4, 5, 7, 9, 16, 23, 100, 100, 100, 100)
    val resArray = binarySearch2(arr, 0, arr.length - 1, 100)
    for (index <- resArray) {
      println(index)
    }

  }

  // 如果存在这个值，就返回其对于的下标，否则返回-1
  def binarySearch(arr: Array[Int], left: Int, right: Int, findVal: Int): Int = {

    if (left > right) {
      return -1
    }
    val midIndex = (left + right) / 2
    val midValue = arr(midIndex)
    if (midValue > findVal) {
      binarySearch(arr, left, midIndex - 1, findVal)
    } else if (midValue < findVal) {
      binarySearch(arr, midIndex + 1, right, findVal)
    } else {
      // 找到了
      return midIndex
    }
  }


  // 若数组中有多个重复值，需要返回一个list
  // 需要使用可变数组 ArrayBuffer
  def binarySearch2(arr: Array[Int], left: Int, right: Int, findVal: Int): ArrayBuffer[Int] = {

    if (left > right) {
      return ArrayBuffer()
    }
    val midIndex = (left + right) / 2
    val midValue = arr(midIndex)
    if (midValue > findVal) {
      binarySearch2(arr, left, midIndex - 1, findVal)
    } else if (midValue < findVal) {
      binarySearch2(arr, midIndex + 1, right, findVal)
    } else {
      // 找到了 向左向右检索结果相同的值并且返回
      // 找到结果后将其加入ArrayBuffer中
      val resArr = ArrayBuffer[Int]()
      // 向左边扫描
      var temp = midIndex - 1
      breakable {
        while (true) {
          if (temp < 0 || arr(temp) != findVal) {
            break
          }
          if (arr(temp) == findVal) {
            resArr.append(temp)
          }
          temp -= 1
        }
      }
      // 将中间的索引也加入
      resArr.append(midIndex)
      // 向右边扫描
      temp = midIndex - 1
      breakable {
        while (true) {
          if (temp > arr.length - 1 || arr(temp) != findVal) {
            break
          }
          if (arr(temp) == findVal) {
            resArr.append(temp)
          }
          temp += 1
        }
      }
      return resArr
    }
  }
}

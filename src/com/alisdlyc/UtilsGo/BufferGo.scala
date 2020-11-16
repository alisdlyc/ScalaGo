package com.alisdlyc.UtilsGo

import scala.collection.mutable.ArrayBuffer

object BufferGo {
  def main(args: Array[String]): Unit = {
    val arr01 = ArrayBuffer[Int]()
    arr01.append(12)
    println(arr01(0))
    arr01(0) = 23
    println(arr01(0))
    arr01.remove(0)
  }
}

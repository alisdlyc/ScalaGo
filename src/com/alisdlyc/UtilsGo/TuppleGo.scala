package com.alisdlyc.UtilsGo

object TuppleGo {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1,2,4,5,7,"qwq")
    println(tuple1)

    // 元组的访问
    println(tuple1._1)
    println(tuple1.productElement(3))
  }
}

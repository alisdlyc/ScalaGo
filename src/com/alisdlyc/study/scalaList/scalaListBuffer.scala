package com.alisdlyc.study.scalaList

import scala.collection.mutable.ListBuffer

object scalaListBuffer {
  def main(args: Array[String]): Unit = {
	val list0 = ListBuffer[Int](1,2,3,4,5)
    list0.append(23)
    println(list0)

    val list1 = new ListBuffer[Int]()
    list1 ++=  list0
    println(list1)
  }
}

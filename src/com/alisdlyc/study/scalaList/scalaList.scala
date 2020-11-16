package com.alisdlyc.study.scalaList

object scalaList {
  def main(args: Array[String]): Unit = {
    // 默认为 immutable 为不可变的
    // 可变的list为list buffer
    val list01 = List(1,2,4)
    println(list01)
    val list02 = Nil
    println(list02)

    // 通过 :+ 和 +：给list追加元素(本身集合无变化)
    var list03 = list01 :+ 5

    // :: 符号的使用
    // 1. Nil is a list()
    // 2. 4 :: 5 :: 6 :: (list04) --> Nil
    // 3. List(4, 5, 6, List(1, 2, 3, 4, qwq))
    val list04 = List(1, 2, 3, 4, "qwq")
    val list05 = 4 :: 5 :: 6 :: list04 :: Nil
    println(list05)

    /**
     * ::: 是将集合中的每一个元素添加到空集合中去
     * re --> List(4, 5, 6, 1, 2, 3, 4, qwq)
     * 将结果打散
     * */
    val list06 = 4 :: 5 :: 6 :: list04 ::: Nil
    println(list06)

  }
}

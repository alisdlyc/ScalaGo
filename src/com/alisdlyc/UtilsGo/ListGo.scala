package com.alisdlyc.UtilsGo

object ListGo {
  def main(args: Array[String]): Unit = {

    /**
     * 在scala包对象中被声明，所以无需引入包，可以直接使用
     * val List = scala.collection.immutable.List
     *
     * val Nil = scala.collection.immutable.Nil
     *
     * Nil = List() // 空集合
     * */
    val list = List(1,2,3,4)
    println(list)

    val list2 = Nil
    println(list2)

    /**
     * scala 向列表中追加元素，会返回新的列表/集合对象
     * */
    // a. 在列表的最后增加数据
    val list3 = list2 :+ 4
    println(list3)
    // b. 在列表的前面增加数据
    val list4 = 55 +: list2
    println(list4)
    println(list2)

    /**
     * c. 在列表的最后增加元素
     * 1) 符号::表示向集合中
     * */
  }

}

package com.alisdlyc.study.scalaQueue

import scala.io.StdIn

/**
 * 数组模拟队列
 * 数组空间不能复用
 * */
object arrayQueue {
  def main(args: Array[String]): Unit = {
    val queue = new arrayQueueDemo(3)
    queue.showQueue()
    queue.addQueue(1)
    queue.addQueue(2)
    queue.addQueue(3)
    queue.addQueue(4)
    queue.showQueue()

    var key = ""
    while (true){
      println("show 显示队列")
      println("exit 退出程序")

      key = StdIn.readLine()
      key match {
        case "show" => queue.showQueue()
        case "exit" => System.exit(0)
      }
    }
  }
}

class arrayQueueDemo(arrMaxSize:Int) {
  val maxSize: Int = arrMaxSize
  val arr = new Array[Int](maxSize)
  var front:Int  = -1 // 指向队列头部的前一个位置
  var rear:Int  = -1 // 指向队列的尾部（包含）

  def isFull(): Boolean = {
    rear == maxSize - 1
  }

  def isEmpty(): Boolean = {
    rear == front
  }

  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列空")
      return
    }
    for (i <- front+1 to rear) {
      printf("arr[%d]=%d\n", i ,arr(i))
    }
  }

  /**
   * 将数据存入队列为 addQueue
   *  + 尾指针向后移动，rear+1, front==rear[空]
   *  + 若尾指引rear小于等于队列的最大下标MaxSize-1，则将数据存入rear所指的数组元素中，否则无法存入
   *  + rear == MaxSize-1 [队列满]
   * */
  def addQueue(n:Int): Unit = {
    if (isFull()) {
      println("队列满 无法加入")
      return
    }

    rear += 1
    arr(rear) = n
  }

  def getQueue(): Any = {
    if (isEmpty()) {
      new Exception("队列空")
    } else {
      front += 1
      arr(front)
    }
  }

  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    return arr(front+1)
  }
}

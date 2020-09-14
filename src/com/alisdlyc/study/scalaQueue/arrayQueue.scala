package com.alisdlyc.study.scalaQueue

object arrayQueue {
  def main(args: Array[String]): Unit = {
    val queue = new arrayQueueDemo(3)
    queue.showQueue()
    queue.addQueue(1)
    queue.addQueue(1)
    queue.addQueue(1)
    queue.addQueue(1)
    queue.showQueue()
  }
}

class arrayQueueDemo(arrMaxSize:Int) {
  val maxSize: Int = arrMaxSize
  val arr = new Array[Int](maxSize)
  var front:Int  = -1
  var rear:Int  = -1

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
      println(arr(i))
    }
  }

  def addQueue(n:Int): Unit = {
    if (isFull()) {
      println("队列满 无法加入")
    } else {
      rear += 1
      arr(rear) = n
    }
  }

  def getQueue(): Any = {
    if (isEmpty()) {
      new Exception("队列空")
    } else {
      front += 1
      arr(front)
    }
  }
}

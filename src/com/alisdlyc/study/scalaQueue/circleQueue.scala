package com.alisdlyc.study.scalaQueue

/**
 * 通过取模的方式将数组看做是环形的
 * + 尾索引的下一个为头索引时表时队列满
 *  - 将队列容量空出一个作为约定，(rear + 1) % maxSize == front时满
 *    + rear == front(空)
 * */
object circleQueue {
  def main(args: Array[String]): Unit = {
    val queue = new circleQueue(4)
    queue.showQueue()
    queue.addQueue(1)
    queue.addQueue(2)
    queue.addQueue(3)

    // 队列满 无法加入，4个元素大小的队列只能存放3个元素
    queue.addQueue(4)
    queue.showQueue()
  }
}

class circleQueue(arrMaxSize: Int) {
  val maxSize: Int = arrMaxSize
  val arr = new Array[Int](maxSize)
  var front: Int = 0 // 指向队列头部
  var rear: Int = 0 // 指向队列的尾部

  // 预留一个空间 便于判断是否为空与满
  def isFull(): Boolean = {
    (rear + 1) % maxSize == front
  }

  def isEmpty(): Boolean = {
    rear == front
  }

  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列空")
      return
    }
    for (i <- front until front + size()) {
      printf("arr[%d]=%d\n", i % maxSize, arr(i % maxSize))
    }
  }

  def size(): Int = {
    // 求出当前环形队列中的元素数
    (rear + maxSize - front) % maxSize
  }

  def addQueue(n: Int): Unit = {
    if (isFull()) {
      println("队列满 无法加入")
      return
    }
    // 将数据加入
    arr(rear) = n
    // 然后将rear 后移， 需要考虑取模
    rear = (rear + 1) % maxSize
  }

  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    // front 已经指向了队列的头元素
    // 1. 将front所在元素值保存到一个变量
    // 2. 将front后移
    // 3. 返回值
    val value = arr(front)
    front = (front + 1) % maxSize
    return value
  }

  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    return arr(front + 1)
  }
}

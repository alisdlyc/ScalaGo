package com.alisdlyc.study.scalaStack

object arrayStack {
  def main(args: Array[String]): Unit = {
    val stack = new arrayStack(4)
    stack.list()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.list()
    stack.pop()
    stack.pop()
    stack.pop()
    stack.pop()
    stack.pop()
  }
}

class arrayStack(size: Int) {
  val maxSize = size
  var arrayStack = new Array[Int](maxSize)
  var top = -1

  // 栈满
  def isFull(): Boolean = {
    top == maxSize-1
  }

  def isEmpty(): Boolean = {
    top == -1
  }

  def push(value: Int): Unit = {
    if (isFull()) {
      println("栈满")
      return
    }
    top += 1
    arrayStack(top) = value
  }

  def pop(): Any = {
    if (isEmpty()) {
      println("栈空")
      return
    }
    val re = arrayStack(top)
    top -= 1
    re
  }

  // 遍历栈
  def list(): Unit = {
    if (isEmpty()) {
      println("栈空")
      return
    }
    for (i <- (0 to top).reverse) {
      printf("[%d]=%d\n", i, arrayStack(i))
    }
  }

}

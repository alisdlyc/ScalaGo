package com.alisdlyc.study.scalaQueue

object scalaQueue {
  def main(args: Array[String]): Unit = {
    val queue = scala.collection.mutable.Queue[Int]()
    queue += 1
    println(queue.mkString(" "))
    println(queue.dequeue())
  }
}

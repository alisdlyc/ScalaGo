package com.alisdlyc.study.scalaArray

import scala.collection.mutable.ArrayBuffer

object SparseArr {
  def main(args: Array[String]): Unit = {
    val chessMap = Array.ofDim[Int](11, 11)
    // init
    chessMap(1)(2) = 1
    chessMap(2)(3) = 3
    var size = 0
    for (row <- chessMap) {
      for (item <- row) {
        if (item != 0) {
          size += 1
        }
        printf("%d\t", item)
      }
      println()
    }

    // change to sparse array
    val arrayBuffer = new ArrayBuffer[Node]()
    val node = new Node(11, 11, size)
    arrayBuffer.append(node)
    for (i <- chessMap.indices) {
      for (j <- chessMap(i).indices) {
        if (chessMap(i)(j) != 0) {
          val node = new Node(i, j, chessMap(i)(j))
          arrayBuffer.append(node)
        }
      }
    }

    for (node <- arrayBuffer) {
      printf("%d\t%d\t%d\n", node.col, node.row, node.value)
    }

    // re build
    val chessRecur = Array.ofDim[Int](arrayBuffer(0).row, arrayBuffer(0).col)
    for (i <- 1 until arrayBuffer(0).value + 1) {
//      val node = new Node(arrayBuffer(i).row, arrayBuffer(i).col, arrayBuffer(i).value)
      chessRecur(arrayBuffer(i).row)(arrayBuffer(i).col) = arrayBuffer(i).value
    }
    for (row <- chessRecur) {
      for (item <- row) {
        if (item != 0) {
          size += 1
        }
        printf("%d\t", item)
      }
      println()
    }

  }
}

class Node(val row:Int, val col:Int, val value:Int)

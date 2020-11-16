package com.alisdlyc.study.scalaList
case class Node[E](var next: Node[E], var data: E) {}

object listDemo {

	def main(args: Array[String]): Unit = {
		val headNode = Node(null, 1)

		val secondNode = Node(null, 2)
		headNode.next = secondNode

		val thirdNode = Node(null, 3)
		secondNode.next = thirdNode

		val fourthNode = Node(null, 4)
		thirdNode.next = fourthNode

		val fifthNode = Node(null, 5)
		fourthNode.next = fifthNode

		var currentNode = headNode
		while (currentNode != null) {
			println(currentNode.data)
			currentNode = currentNode.next
		}
	}
}
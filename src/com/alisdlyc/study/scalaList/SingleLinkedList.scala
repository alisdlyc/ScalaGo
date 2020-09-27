package com.alisdlyc.study.scalaList

import scala.util.control.Breaks.{break, breakable}

object SingleLinkedList {
  def main(args: Array[String]): Unit = {
    val heroNode2 = new HeroNode(2, "ovo", "sj")
    val heroNode1 = new HeroNode(1, "qwq", "松江")
    val heroNode3 = new HeroNode(3, "QWQ", "js")
    val heroNode4 = new HeroNode(5, "SOS", "qwq")

    val singleLinkedList = new SingleLinkedList
    singleLinkedList.addToIndex(heroNode1)
    singleLinkedList.list()

    println("*---------------------*")

    singleLinkedList.addToIndex(heroNode4)
    singleLinkedList.addToIndex(heroNode2)
    singleLinkedList.addToIndex(heroNode3)
    singleLinkedList.list()

  }
}

// 定义单向链表 管理hero
class SingleLinkedList{
  // 初始化一个头结点
  val head = new HeroNode(0, "", "")

  // 编写添加的方法
  def add(heroNode: HeroNode): Unit = {
    var temp = head
    breakable{
      while (true) {
        if (temp.next == null) {
          // 说明temp就是链表最后的结点
          break
        }
        temp = temp.next
      }
    }
    temp.next = heroNode
  }

  /**
   * 将结点加入到编号所在的位置
   * */
  def addToIndex(heroNode: HeroNode): Unit = {
    var temp = head
    breakable{
      while (true) {
        if (temp.next == null || temp.next.no > heroNode.no) {
          break()
        }
        temp = temp.next
      }
    }
    heroNode.next = temp.next
    temp.next = heroNode
  }
  /**
   *
   * */
  def list(): Unit = {
    // 判断当前链表是否为空
    if (head.next == null) {
      println("链表为空")
      return
    }

    var temp = head.next
    while (temp != null) {
      temp.show()
      temp = temp.next
    }
  }
}

class HeroNode(hNo:Int, hName:String, hNickName:String) {
  var no : Int = hNo
  var name : String = hName
  var nickName : String = hNickName
  var next : HeroNode = null

  def show(): Unit = {
    println("no: " + no + " name: " + name + " nickName " + nickName)
  }
}

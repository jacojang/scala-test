package jacojang.scala.test.binaryTreeDistance

/**
  * Created by jacojang on 2017. 2. 9..
  */
class Node {
}

class BinaryTree(datas:Array[Integer]) {

  private val root:Node = setup(datas)

  private def add(data: Integer) = {
    val node = new Node()

  }

  private def setup(datas: Array[Integer]):Node = {

    for(val data <- datas){
      add(node, data)
    }
    node
  }


  def findNode(value:Integer):Node = {
    new Node
  }

  def distance(value1:Integer, value2:Integer):Integer = {
    0
  }
}

import java.util

import javax.swing.tree.TreeNode
//给定一个二叉树，返回它的中序 遍历。
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 697 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
///**
// * Definition for a binary tree node.
// * class TreeNode(var _value: Int) {
// *   var value: Int = _value
// *   var left: TreeNode = null
// *   var right: TreeNode = null
// * }
// */
//object Solution {
//    def inorderTraversal(root: TreeNode): List[Int] = {
//        def inorderTraversal(root: TreeNode, returnValue: List[Int]): List[Int] = {
//            if (root == null) returnValue
//            else inorderTraversal(root.right, inorderTraversal(root.left, returnValue) :+ root.value)
//        }
//
//        inorderTraversal(root, List.empty)
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)

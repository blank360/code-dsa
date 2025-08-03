// class Node{
//     int data;
//     Node left;
//     Node right;

//     public Node(int key) {
//         data = key;
//         left = null;
//         right = null;
//     }
    
// }
// public class bintree{

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.right.left = new Node(4);
//     }
// }
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         preorderHelper(root, result);
//         return result;
//     }

//     private void preorderHelper(TreeNode node, List<Integer> result) {
//         if (node == null) {
//             return;
//         }
//         result.add(node.val); // Visit the node
//         preorderHelper(node.left, result); // Visit left subtree
//         preorderHelper(node.right, result); // Visit right subtree
//     }
// }
public class bintree{
    public static void main(String [] args){
        int[] array = {10 ,20 , 30 , 40 , 50 , 60};
        int i = 0;
        System.out.println(array[i++]);
        System.out.println(array[++i]);
    }
}
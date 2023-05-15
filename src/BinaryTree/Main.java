package BinaryTree;

public class Main {
    public static void main(String[] args){
        /*

            1
           / \
          2   3

         */
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);

        //Print out all the nodes
        printAllNodes(root);

        //Searching for 3
        System.out.println(searchNodes(root, 3));
    }

    public static void printAllNodes(TreeNode<Integer> root){
        //Base case
        if (root == null){
            return;
        }

        //print node in the middle
        System.out.println(root.val);

        // print the tree on the left of the middle node
        printAllNodes(root.left);

        // print the tree on the right of the middle node
        printAllNodes(root.right);
    }
    public static boolean searchNodes(TreeNode<Integer> root, int target){
        if (root == null){
            return false;
        }

        if (root.val == target){
            return true;
        }

        if (target > root.val){
            return searchNodes(root.right, target);
        }
        return searchNodes(root.left, target);
    }
}

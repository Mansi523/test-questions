
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        // Base case: if the tree is empty, its depth is 0
        if (root == null) {
            return 0;
        }
        
        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Return the maximum depth among left and right subtrees, plus 1 (for the current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        // Calculate the maximum depth
        MaxDepthOfBinaryTree solution = new MaxDepthOfBinaryTree();
        int depth = solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}

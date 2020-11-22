/**
 * 
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        //Put inorder array to hashmap to help find root
        this.map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        //Build tree recursively
        return this.myBuildTree(preorder, inorder, 0, n-1, 0, n-1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int preorderStart, 
                                 int preorderEnd, int inorderStart, int inorderEnd) {
        //Recursion terminator
        if(preorderStart > preorderEnd) {
            return null;
        }

        //Process
        TreeNode root = new TreeNode(preorder[preorderStart]);
        //Index of root in inorder array. 
        int rootIndex = this.map.get(preorder[preorderStart]);
        //Size of left tree
        int leftSize = rootIndex - inorderStart;

        //drilldown
        root.left = myBuildTree(preorder, inorder, 
                                preorderStart + 1, preorderStart + leftSize, 
                                inorderStart, rootIndex - 1);
        root.right = myBuildTree(preorder, inorder, 
                                 preorderStart + leftSize + 1, preorderEnd, 
                                 rootIndex + 1, inorderEnd);

        return root;
    }
}

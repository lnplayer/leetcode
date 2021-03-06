package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * @author ln
 *
 */
public class Problem111 {
	public int minDepth(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    if(root.left == null && root.right != null) return minDepth(root.right)+1;
    if(root.left != null && root.right == null) return minDepth(root.left)+1;
    else return Math.min(minDepth(root.left), minDepth(root.right)) +1 ;
	}
}

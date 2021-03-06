package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Symmetric Tree
 * @author ln
 *
 */
public class Problem101 {
	public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    else return check(root.left, root.right);
	}
	public boolean check(TreeNode p, TreeNode q){
	    if(p==null && q==null) return true;
	    if(p==null && q!=null) return false;
	    if(p!=null && q==null) return false;
	    if(p.val!=q.val) return false;
	    else{
	        return check(p.left, q.right) && check(p.right, q.left);
	    }
	}
}

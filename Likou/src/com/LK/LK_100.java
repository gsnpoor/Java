package com.LK;

public class LK_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;
        TreeNode node1 = p;
        TreeNode node2 = q;
        flag = db(node1, node2, flag);
        return flag;
    }

    public static boolean db(TreeNode node1, TreeNode node2, boolean flag) {
        if (node1 == null && node2 == null){
            return flag;
        }else if (node1 == null || node2 == null) {
            return flag = false;
        }else if (!flag || node1.val != node2.val) {
            return flag = false;
        }else {
            return db(node1.left, node2.left, flag) && db(node1.right, node2.right, flag);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

package com.master;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//树的四种遍历方式
class SolutionBM23 {
    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsPreorder(root, list);
        return list;
    }
    public void dfsPreorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        dfsPreorder(root.left, list);
        dfsPreorder(root.right, list);
    }

    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsInorder(root, list);
        return list;
    }
    public void dfsInorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfsInorder(root.left, list);
        list.add(root.val);
        dfsInorder(root.right, list);

    }

    //后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfsPostorder(root, list);
        return list;
    }
    public void dfsPostorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfsPostorder(root.left, list);
        dfsPostorder(root.right, list);
        list.add(root.val);
    }

    //层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

    }
}

public class NK_BM23 {
}

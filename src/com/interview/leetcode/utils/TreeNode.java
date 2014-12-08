package com.interview.leetcode.utils;

import com.interview.basics.model.collection.hash.HashMap;

/**
 * Created_By: stefanie
 * Date: 14-11-13
 * Time: 下午1:40
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode sampleBST(){
        HashMap<Integer, TreeNode> nodes = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            nodes.put(i, new TreeNode(i));
        }
        nodes.get(5).left = nodes.get(2);
        nodes.get(5).right = nodes.get(7);
        nodes.get(2).left = nodes.get(1);
        nodes.get(2).right = nodes.get(3);
        nodes.get(3).right = nodes.get(4);
        nodes.get(7).left = nodes.get(6);
        nodes.get(7).right = nodes.get(9);
        return nodes.get(5);
    }
}

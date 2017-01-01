package org.vineetnair.hackerrank.tutorials.ctci;

import org.vineetnair.hackerrank.utils.BTNode;

import java.util.Stack;

/**
 * vineet.
 */
public class BSTCheckInorder {
    static class Node implements BTNode {
        int data;
        BTNode left;
        BTNode right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

        Node(int data, BTNode left, BTNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public BTNode getLeft() {
            return left;
        }

        @Override
        public BTNode getRight() {
            return right;
        }

        @Override
        public int getData() {
            return data;
        }
    }

    public boolean checkBST (BTNode root) {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            return true;
        }

        Stack<BTNode> stack = new Stack<>();

        BTNode p = root;

        int min = Integer.MIN_VALUE;

        while(!stack.empty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.getLeft();
            } else {
                BTNode node = stack.pop();
                if (node.getData() < min) {
                    return false;
                } else {
                    min = node.getData();
                }
                p = node.getRight();
            }
        }
        return true;
    }
}

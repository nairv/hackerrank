package org.vineetnair.hackerrank.tutorials.ctci;

import org.vineetnair.hackerrank.utils.BTNode;

/**
 * vineet.
 */
public class BSTCheckRecursive {
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
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil (BTNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.getData() < min || node.getData() > max) {
            return false;
        }

        return isBSTUtil(node.getLeft(), min, node.getData() - 1)
                && isBSTUtil(node.getRight(), node.getData() + 1, max);
    }
}

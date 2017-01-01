package org.vineetnair.hackerrank.tutorials.ctci;

import org.junit.Test;
import org.vineetnair.hackerrank.utils.BTNode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vineetnair.hackerrank.tutorials.ctci.BSTCheckInorder.Node;

/**
 * vineet.
 */
public class BSTCheckInorderTest {

    private BTNode root;

    private BSTCheckInorder sut = new BSTCheckInorder();

    @Test
    public void testCheckBST_returns_true_for_BST() throws Exception {
        BTNode n11 = new Node(1);
        BTNode n12 = new Node(4);
        BTNode n21 = new Node(6);
        BTNode n22 = new Node(8);
        BTNode n1 = new Node(3, n11, n12);
        BTNode n2 = new Node(7, n21, n22);
        root = new Node(5, n1, n2);
        assertThat(sut.checkBST(root)).isTrue();
    }

    @Test
    public void testCheckBST_returns_false_for_nonBST() {
        Node n11 = new Node(1);
        Node n12 = new Node(8);
        Node n21 = new Node(6);
        Node n22 = new Node(8);
        Node n1 = new Node(3, n11, n12);
        Node n2 = new Node(7, n21, n22);
        root = new Node(5, n1, n2);
        assertThat(sut.checkBST(root)).isFalse();
    }
}
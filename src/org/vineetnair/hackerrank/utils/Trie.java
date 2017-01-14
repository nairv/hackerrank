package org.vineetnair.hackerrank.utils;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Preconditions;

/**
 * Trie implementation.
 */
public class Trie {
    private TrieNode root;

    public TrieNode getRoot() {
        return root;
    }

    /**
     * Constructor for initializing a {@link Trie}
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Method for adding a word in the Trie data structure.
     * @param s - word for adding into the trie.
     */
    public void add(String s) {
        Preconditions.checkNotNullOrEmpty(
                StringUtils.stripToEmpty(s));

        TrieNode temp = root;
        root.incrementNodeCount();
        for (char c: s.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                TrieNode cTrieNode = new TrieNode(c);
                temp.children.put(c, cTrieNode);
            }
            temp = temp.children.get(c);
            temp.incrementNodeCount();
        }
        temp.setLeaf();
    }

    public boolean search(String s) {
        Preconditions.checkNotNullOrEmpty(
                StringUtils.stripToEmpty(s));

        TrieNode temp = root;

        for (char c: s.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                return false;
            }
            temp = temp.children.get(c);
        }
        if(temp.isLeafNode()) {
            return true;
        } else {
            return false;
        }
    }

    public int find(String s) {
        Preconditions.checkNotNullOrEmpty(
                StringUtils.stripToEmpty(s));

        TrieNode temp = root;

        for (char c: s.toCharArray()) {
            if (!temp.children.containsKey(c)) {
                return 0;
            }
            temp = temp.children.get(c);
        }
        return temp.getCount();
    }
}

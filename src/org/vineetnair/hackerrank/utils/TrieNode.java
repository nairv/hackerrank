package org.vineetnair.hackerrank.utils;

import java.util.HashMap;

/**
 * Trie Node for the {@link Character} class.
 */
public class TrieNode {
    Character character;
    HashMap<Character, TrieNode> children = new HashMap<>();
    private boolean isLeaf = false;
    private int count;

    public TrieNode() {}

    public TrieNode(char c) {
        this.character = c;
    }

    public int getCount() {
        return count;
    }

    public void setLeaf() {
        isLeaf = true;
    }

    public boolean isLeafNode() {
        return isLeaf;
    }

    public void incrementNodeCount() {
        count++;
    }
}

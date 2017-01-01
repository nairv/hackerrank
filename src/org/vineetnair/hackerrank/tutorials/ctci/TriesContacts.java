package org.vineetnair.hackerrank.tutorials.ctci;

import org.assertj.core.util.Preconditions;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-contacts?h_r=next-challenge&h_v=zen
 */
public class TriesContacts {
    TrieNode root = new TrieNode();
    static class TrieNode {
        char character;
        int count = 0;
        TrieNode[] children = new TrieNode[26];
    }

    public void add(String name) {
        Preconditions.checkNotNull(name);

        char[] cName = name.toCharArray();
        root.count++;
        TrieNode node = root;
        for (char c: cName) {
            TrieNode temp;
            if (node.children[c - 'a'] == null) {
                temp = new TrieNode();
                node.children[c - 'a'] = temp;
            } else {
                temp = node.children[c -'a'];
            }
            temp.count++;
            node = temp;
        }
    }

    public int find(String name) {
        Preconditions.checkNotNull(name);

        char[] cName = name.toCharArray();
        TrieNode node = root;
        for (char c: cName) {
            if (node.children[c - 'a'] == null) {
                return 0;
            } else {
                node = node.children[c - 'a'];
            }
        }
        return node.count;
    }

    public static void main(String[] args) {
        TriesContacts sol = new TriesContacts();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                sol.add(contact);
            } else {
                System.out.println(sol.find(contact));
            }
        }
    }
}

package org.vineetnair.hackerrank.tutorials.ctci;

import org.vineetnair.hackerrank.utils.Trie;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-contacts?h_r=next-challenge&h_v=zen
 */
public class TriesContacts {
    Trie trie;

    public TriesContacts() {
        trie = new Trie();
    }

    public static void main(String[] args) {
        TriesContacts sol = new TriesContacts();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                sol.trie.add(contact);
            } else {
                System.out.println(sol.trie.search(contact));
            }
        }

    }
}

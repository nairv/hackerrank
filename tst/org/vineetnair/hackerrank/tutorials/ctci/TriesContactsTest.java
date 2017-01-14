package org.vineetnair.hackerrank.tutorials.ctci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * test {@link TriesContacts}.
 */
public class TriesContactsTest {
    TriesContacts sut = new TriesContacts();

    @Before
    public void setUp() {
        sut.trie.add("hack");
        sut.trie.add("hackerrank");
    }

    @Test
    public void testAdd() throws Exception {
        assertThat(sut.trie.getRoot().getCount()).isEqualTo(2);
    }

    @Test
    public void testFind() throws Exception {
        assertThat(sut.trie.find("hack")).isEqualTo(2);
        assertThat(sut.trie.find("hacker")).isEqualTo(1);
        assertThat(sut.trie.find("vin")).isEqualTo(0);
    }

    @Test
    public void testSearch() throws Exception {
        assertThat(sut.trie.search("hack")).isTrue();
        assertThat(sut.trie.search("hacker")).isFalse();
        assertThat(sut.trie.search("vin")).isFalse();
    }
}
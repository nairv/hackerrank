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
        sut.add("hack");
        sut.add("hackerrank");
    }

    @Test
    public void testAdd() throws Exception {
        assertThat(sut.root.count).isEqualTo(2);
    }

    @Test
    public void testFind() throws Exception {
        assertThat(sut.find("hack")).isEqualTo(2);
        assertThat(sut.find("hacker")).isEqualTo(1);
        assertThat(sut.find("vin")).isEqualTo(0);
    }
}
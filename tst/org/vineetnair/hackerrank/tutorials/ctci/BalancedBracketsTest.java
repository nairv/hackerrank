package org.vineetnair.hackerrank.tutorials.ctci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link BalancedBrackets}.
 */
public class BalancedBracketsTest {
    private BalancedBrackets sut;

    @Before
    public void setUp() {
        sut = new BalancedBrackets();
    }

    @Test
    public void testIsBalanced() throws Exception {
        String st1 = "{()";
        String st2 = "{]]";
        String st3 = "[[{{}}";
        String st4 = "({)}";
        String st5 = "({[])}";
        String st6 = "{()[{()}]}";

        assertThat(sut.isBalanced(st1)).isFalse();
        assertThat(sut.isBalanced(st2)).isFalse();
        assertThat(sut.isBalanced(st3)).isFalse();
        assertThat(sut.isBalanced(st4)).isFalse();
        assertThat(sut.isBalanced(st5)).isFalse();
        assertThat(sut.isBalanced(st6)).isTrue();
    }
}
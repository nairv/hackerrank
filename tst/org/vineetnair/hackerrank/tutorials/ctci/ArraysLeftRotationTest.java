package org.vineetnair.hackerrank.tutorials.ctci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArraysLeftRotationTest {

    private static int[] INPUT = {1, 2, 3, 4, 5};
    private final ArraysLeftRotation SUT = new ArraysLeftRotation();

    @Test
    public void test_rotation_4_times() {

        assertThat(SUT.performLeftRotations(INPUT, 4)).containsExactly(5,1,2,3,4);
    }

    @Test
    public void test_rotation_9_times() {
        assertThat(SUT.performLeftRotations(INPUT, 9)).containsExactly(5,1,2,3,4);
    }

}
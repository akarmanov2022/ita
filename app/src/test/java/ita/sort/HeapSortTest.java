package ita.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    @Test
    void heapSortTest() {
        var numbers = ThreadLocalRandom.current()
                .ints(20, 10, 100)
                .toArray();
        SimpleSort sort = new HeapSort();
        sort.sort(numbers);
        int[] expected = Arrays.stream(numbers).sorted().toArray();

        assertArrayEquals(expected, numbers);
    }
}
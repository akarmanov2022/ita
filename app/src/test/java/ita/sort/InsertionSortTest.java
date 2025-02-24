package ita.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

  @Test
  void sort() {
    SimpleSort insertionSort = new InsertionSort();
    int[] numbers = {5, 2, 4, 6, 1, 3};
    int[] sortedNumbers = insertionSort.sort(numbers);
    int[] expectedNumbers = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(expectedNumbers, sortedNumbers);
  }

}
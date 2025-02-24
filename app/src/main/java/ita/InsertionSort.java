package ita;

public class InsertionSort implements SimpleSort {
  @Override
  public int[] sort(int[] numbers) {
    for (int i = 1; i < numbers.length; i++) {
      int key = numbers[i];
      int j = i - 1;
      while (j >= 0 && numbers[j] > key) {
        numbers[j + 1] = numbers[j];
        j = j - 1;
      }
      numbers[j + 1] = key;
    }
    return numbers;
  }
}

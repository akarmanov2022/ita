package ita.sort;

public class InsertionDescendingSort implements SimpleSort {
  @Override
  public int[] sort(int[] numbers) {
    for (int i = numbers.length - 2; i > -1; i--) {
      var value = numbers[i];
      var j = i + 1;
      while (j < numbers.length && value > numbers[j]) {
        numbers[j - 1] = numbers[j];
        j++;
      }
      numbers[j - 1] = value;
    }
    return numbers;
  }
}

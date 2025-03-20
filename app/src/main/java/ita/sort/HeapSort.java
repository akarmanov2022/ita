package ita.sort;

public class HeapSort implements SimpleSort {
    @Override
    public int[] sort(int[] numbers) {
        int heapSize = numbers.length - 1;
        buildMaxHeaoify(numbers, heapSize);
        for (int i = numbers.length - 1; i >= 0; i--) {
            exchange(numbers, 0, i);
            heapSize--;
            maxHeapify(numbers, 0, heapSize);
        }
        return numbers;
    }

    private void maxHeapify(int[] numbers, int index, int heapSize) {
        var left = left(index);
        var right = right(index);
        var largest = index;

        if (left <= heapSize && numbers[left] > numbers[index]) {
            largest = left;
        }

        if (right <= heapSize && numbers[right] > numbers[largest]) {
            largest = right;
        }
        if (largest != index) {
            exchange(numbers, index, largest);
            maxHeapify(numbers, largest, heapSize);
        }
    }

    private void buildMaxHeaoify(int[] numbers, int heapSize) {
        for (int i = Math.floorDiv(heapSize, 2); i >= 0; i--) {
            maxHeapify(numbers, i, heapSize);
        }
    }

    private void exchange(int[] numbers, int first, int second) {
        var copy = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = copy;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int parent(int i) {
        return i / 2;
    }
}

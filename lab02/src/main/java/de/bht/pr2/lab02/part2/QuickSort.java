package de.bht.pr2.lab02.part2;

public class QuickSort {

  private static int partition(int[] array, int begin, int end) {
    int pivot = array[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (array[j] <= pivot) {
        i++;

        int swapTemp = array[i];
        array[i] = array[j];
        array[j] = swapTemp;
      }
    }

    int swapTemp = array[i + 1];
    array[i + 1] = array[end];
    array[end] = swapTemp;

    return i + 1;
  }

  public static int[] sort(int[] array) {
    return sort(array, 0, array.length - 1);
  }

  private static int[] sort(int[] array, int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(array, begin, end);

      sort(array, begin, partitionIndex - 1);
      sort(array, partitionIndex + 1, end);
    }
    return array;
  }
}

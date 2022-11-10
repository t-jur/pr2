package de.bht.pr2.lab02.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSortingAlgorithm {
    @Test
    void testbs() {
        int[] arr = new int[]{8, 9, 5, 32, 41, 9, -12};
        int[] arr_sort = new int[]{-12, 5, 8, 9, 9, 32, 41};
        assertArrayEquals(arr_sort,BubbleSort.sort(arr));
    }
    @Test
void testis() {
        int[] arr = new int[]{8, 9, 5, 32, 41, 9, -12};
        int[] arr_sort = new int[]{-12, 5, 8, 9, 9, 32, 41};
        assertArrayEquals(arr_sort,InsertionSort.sort(arr));
    }
    @Test
void testqs() {
        int[] arr = new int[]{8, 9, 5, 32, 41, 9, -12};
        int[] arr_sort = new int[]{-12, 5, 8, 9, 9, 32, 41};
        assertArrayEquals(arr_sort,QuickSort.sort(arr));
    }

}

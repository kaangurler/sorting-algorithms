package Sort.Concrete;

import Sort.SortingAlgorithm;

import java.util.List;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - (i + 1); j++) {
                if (list.get(j + 1) < list.get(j)) {
                    this.swapElements(list, j, j + 1);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Bubble Sort";
    }
}

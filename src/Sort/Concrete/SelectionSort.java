package Sort.Concrete;

import Sort.SortingAlgorithm;

import java.util.List;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                this.swapElements(list, i, minIndex);
            }
        }
    }
    @Override
    public String toString() {
        return "Selection Sort";
    }
}

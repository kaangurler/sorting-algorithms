package Sort.Concrete;

import Sort.SortingAlgorithm;

import java.util.List;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(i) < list.get(j)) {
                    this.swapElements(list, i, j);
                    i--;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Insertion Sort";
    }
}

package Sort;

import java.util.List;

public interface SortingAlgorithm {
    void sort(List<Integer> list);
    default void swapElements(List<Integer> list, int index1, int index2) {
        int temp = list.get(index2);
        list.set(index2, list.get(index1));
        list.set(index1, temp);
    }
}

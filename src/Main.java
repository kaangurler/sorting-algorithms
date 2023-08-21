import Sort.Concrete.BubbleSort;
import Sort.Concrete.InsertionSort;
import Sort.Concrete.SelectionSort;
import Sort.SortingAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            SortingAlgorithm sortingAlgorithm = null;
            System.out.println("-----------------------------------------------------------");
            List<Integer> list = new ArrayList<>();
            generateList(list);
            System.out.println("List: " + list);
            System.out.println("1. Selection Sort\n2. Bubble Sort\n3. Insertion Sort");
            switch (scanner.nextInt()) {
                case 1 -> sortingAlgorithm = new SelectionSort();
                case 2 -> sortingAlgorithm = new BubbleSort();
                case 3 -> sortingAlgorithm = new InsertionSort();
            }
            if (sortingAlgorithm != null) {
                sortingAlgorithm.sort(list);
                System.out.println(" -> " + sortingAlgorithm + " : " + list);
            }
        }
    }

    private static void generateList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            int randomInt = (int) ((Math.random() * 20) - 10);
            list.add(randomInt);
        }
    }
}
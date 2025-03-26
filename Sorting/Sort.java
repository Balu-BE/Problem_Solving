package Sorting;

public class Sort {
    public static int[] selectionSort(int arr[]) {
        int min = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

}

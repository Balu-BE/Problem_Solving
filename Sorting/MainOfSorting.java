package Sorting;
import java.util.Scanner;

public class MainOfSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the "+i+" element : ");
            array[i] = scanner.nextInt();
        } 
        System.out.println("Given Array : \n");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Sorting methods
        // 1. Selection Sort
        int outputArray[] = Sort.selectionSort(array);
        for (int i : outputArray) {
            System.out.print(i+" ");
        }
scanner.close();
 }
    public static int[] swap(int a,int b){
        int[] ans = new int[2];
        int temp = a;
        a = b;
        b = temp;
        ans[0]= a;
        ans[1]= b;
    return ans;
    }
}

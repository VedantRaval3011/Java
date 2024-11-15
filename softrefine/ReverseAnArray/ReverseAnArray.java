package ReverseAnArray;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {

            swap(arr, i, n - i - 1);
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
package ru.baryshnikov.task15;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ReversedArray ra = new ReversedArray();
        ra.arrReverse(arr);
    }

    public void arrReverse(int[] array) {
        int l = (array.length) - 1;

        for (int cycle = 1; cycle <= array.length; cycle++) {
            for (int i = l; i >= cycle; i--) {
                int num = array[i];
                int out = array[i - 1];

                array[i] = out;
                array[i - 1] = num;

                for (int f : array) {
                    System.out.print(f + " ");
                }
                System.out.println(" ");
            }
        }
    }
}

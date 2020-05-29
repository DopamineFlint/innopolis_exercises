package ru.baryshnikov.task15;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        TwoDimArray tda = new TwoDimArray();
        tda.toLeft(arr);
    }

    public void toLeft(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    array[i][j] = 0;
                } else {
                    int num = array[i][j];
                    int out = array[i][j + 1];

                    array[i][j] = out;
                    array[i][j + 1] = num;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

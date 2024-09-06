package ru.anseranser;

public class Main {

    public static void main(String[] args) {

    }


    public static long getTwoMinSum(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int minL = Math.min(array[0], array[1]);
        int minR = Math.max(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            int current = array[i];

            if (current <= minL) {
                minR = minL;
                minL = current;
            } else if (current < minR) {
                minR = current;
            }
        }

        return (long) minL + (long) minR;
    }
}

package org.example;

import java.util.Arrays;

public class Operation<T extends Comparable<T>> {
    T[] array;

    public void getValue(T[] array) {
        this.array = array;
        maximum();
    }


    public <T extends Comparable<T>> void maximum() {
        Arrays.sort(array);
        findMax();
    }

    public void sort() {
        System.out.println("sorted array are  ");
        for (T num : array) {
            System.out.print(num + " ");
        }
    }

    public void findMax() {
        Integer index = array.length;
        T object = array[index - 1];
        System.out.println("Maximum number are = " + object);
    }
}

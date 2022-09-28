package org.example;

public class Maximum {
    public static void main(String[] args) {
        Integer[] intArray = {23, 45, 12, 04, 65, 34, 65, 56, 34, 56, 84, 45, 94};
        Double[] doubleArray = {11.0, 12.0, 23.0, 34.0, 23.0, 34.0, 23.0};
        String[] stringArray = {"Durgesh", "Ashish", "Vicky", "Suman"};
        Operation<Integer> operation1 = new Operation<>();
        Operation<Double> operation2 = new Operation<>();
        Operation<String> operation3 = new Operation<>();
        operation1.getValue(intArray);
        operation2.getValue(doubleArray);
        operation3.getValue(stringArray);
        operation1.findMax();
        operation2.findMax();
        operation3.findMax();
    }
}

package org.example;

public class Maximum {
    public static void main(String[] args) {
        Operation<String> in = new Operation<>();
        String s1 = in.Maximum("Apple", "Banana", "Peach");
        System.out.println(s1 + " is maximum String");
    }
}

package org.example.Max;

public class Operation<T extends Number> {
    Integer x;
    Integer y;
    Integer z;

    public void Maximum(Integer x,Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        if (x > y) {
            if (x > z) {
                System.out.println(x + " is maximum number ");
            } else {
                System.out.println(z + "  is maximum number  ");
            }
        } else if (y > z) {
            System.out.println(y + " is maximum number ");
        } else {
            System.out.println(z + " is maximum number");
        }
    }

}

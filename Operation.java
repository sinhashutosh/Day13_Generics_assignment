package org.example;

public class Operation<T extends  String> {
  String x;
  String y;
  String z;

    public String Maximum(String x,String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;

        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}

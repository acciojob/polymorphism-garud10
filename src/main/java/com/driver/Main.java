package com.driver;

class Product{
    public int product(int x, int y) {
        return x * y;
    }
    public int product(int x, int y, int z) {
        return x * y * z;
    }
    public double product(double x, double y) {
        return x * y;
    }
}
public class Main {

    public static void main(String args[]){
        int x = 10;
        int y = 12;
        int z = 20;
        double a = 10;
        double b = 20;

        Product p = new Product();
        p.product(x, y);
        p.product(x, y, z);
        p.product(a, b);
    }

}
package com.nearsoft.introducingMethods.boxDemo4;

class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        // assign values to myBox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        /* assign different values to myBox2's instance variables */
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // compute volume of first box
        volume = myBox1.volume();
        System.out.println("Volume is " + volume);
        // compute volume of second box
        volume = myBox2.volume();
        System.out.println("Volume is " + volume);
    }
}

package com.nearsoft.classFundamentals.boxDemo;

// Define Box class
class Box {
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box.
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        // assign values to myBox's instance variables
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        // compute volume of box
        double volume = myBox.width * myBox.height * myBox.depth;
        // Print volume value
        System.out.println("Volume is " + volume);
    }
}

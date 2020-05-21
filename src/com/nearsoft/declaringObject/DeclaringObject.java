package com.nearsoft.declaringObject;

class Box {
    double width;
    double height;
    double depth;
}

public class DeclaringObject {
    public static void main(String[] args) {
        Box myBox;          // declare reference to object
        myBox = new Box();  // allocate a Box object
        myBox.width = 10;   // once the object has been allocated
                            // we can use its members

        Box myBox2 = new Box(); // this statement combines the two steps

        Box myBox3;
        //myBox3.depth = 10;  // Error: Variable might not been initialized.
    }
}

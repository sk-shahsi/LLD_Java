package com.stractural.flyweight.solution;
// Flyweight (Interface) - for the flyweight object
public interface IRobot {
    //CoordinateX and CoordinateY are extrinsic data - unique to each object
    void display(int x, int y);
}

package com.canvas.model;

/**
 * Class to hold user input co-ordinates
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
       this.x=x;
       this.y=y;
   }

    public int getXAxisDistance(Point p1){
        return x-p1.x;
    }
    public int getYAxisDistance(Point p1){
        return y-p1.y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

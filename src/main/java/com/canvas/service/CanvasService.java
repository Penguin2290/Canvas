package com.canvas.service;

import com.canvas.exception.CanvasException;
import com.canvas.model.Line;
import com.canvas.model.Point;
import com.canvas.model.Rectangle;

/**
 * Service class offering methods to create and draw the canvas, line , rectangle
 */
public class CanvasService {
    int breadth;
    int height;
    protected char[][] canvas =null;

    /**
     * Constructor for CanvasService,initializes the canvas
     * @param breadth
     * @param height
     */
     public CanvasService(int breadth, int height){
        this.breadth=breadth;
        this.height=height;
         canvas =new char[this.height+2][this.breadth+2];
         for (int i = 0; i< canvas.length; i++){
             for (int k = 0; k< canvas[i].length; k++){
                 canvas[i][k]=' ';
             }
         }

    }

    public int getBreadth() {
        return breadth;
    }


    public int getHeight() {
        return height;
    }


    /**
     * Method to draw Line in a canvas
     * throws CanvasException when lines are not horizontal or vertical
     * @param p1
     * @param p2
     * @throws CanvasException
     */
    public void drawLine(Point p1, Point p2)throws CanvasException {
        Line l=new Line(p1,p2);
        canvas =l.draw(canvas,false);
    }

    /**
     * Method to draw Rectangle in the canvas
     * throws CanvasException when lines of rectangle are not horizontal or vertical
     * @param p1
     * @param p2
     * @param canvasBorder
     * @throws CanvasException
     */
    public void drawRectangle(Point p1,Point p2,boolean canvasBorder)throws CanvasException{
        Rectangle rectangle=new Rectangle(p1,p2);
        canvas =rectangle.draw(canvas,canvasBorder);
    }
}

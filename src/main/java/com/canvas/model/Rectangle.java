package com.canvas.model;

import com.canvas.exception.CanvasException;
import com.canvas.util.LineUtil;
import com.canvas.util.Util;

/**
 * Rectangle implementation for abstract class Shape
 */
public class Rectangle extends Shape {
    Point point1;
    Point point2;
    public Rectangle(Point point1,Point point2){
     this.point1=point1;
     this.point2=point2;
    }

    /**
     * Rectangle implementation for draw method of super class Shape,
     * throws CanvasException when the lines in the rectangle are not vertical or horizontal
     * takes canvasBorder argument if the user draws the canvas
     * @param canvas
     * @param canvasBorder
     * @return
     * @throws CanvasException
     */
    @Override
    public char[][] draw(char[][] canvas, boolean canvasBorder) throws CanvasException {
        int xPos1=point1.getX();
        int ypos1=point1.getY();
        int xPos2=point2.getX();
        int ypos2=point2.getY();
        canvas=LineUtil.drawVerticalLine(new Point(xPos1,ypos1),new Point(xPos1,ypos2),canvas,canvasBorder);
        canvas=LineUtil.drawVerticalLine(new Point(xPos2,ypos1),new Point(xPos2,ypos2),canvas,canvasBorder);
        canvas= LineUtil.drawHorizontalLine(new Point(xPos1,ypos1),new Point(xPos2,ypos1),canvas,canvasBorder);
        canvas=LineUtil.drawHorizontalLine(new Point(xPos1,ypos2),new Point(xPos2,ypos2),canvas,canvasBorder);
        Util.printCanvasToConsole(canvas);
        return canvas;
    }
}

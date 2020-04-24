package com.canvas.model;

import com.canvas.exception.CanvasException;
import com.canvas.util.LineUtil;
import com.canvas.util.Util;

/**
 * Line implementation for abstract Shape class
 */
public class Line extends Shape {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Line implementation for draw method of super class Shape,
     * throws CanvasException when the lines are not vertical or horizontal
     * takes canvasBorder argument if the user draws the canvas
     * @param canvas
     * @param canvasBorder
     * @return
     * @throws CanvasException
     */
    @Override
    public char[][] draw(char[][] canvas, boolean canvasBorder) throws CanvasException{
        int xDiff= point1.getXAxisDistance(point2);
        int yDiff= point1.getYAxisDistance(point2);
        if (xDiff !=0 && yDiff!=0){
            throw new CanvasException("Line can only be drawn Horizontally or Vertically");
        }
        if (xDiff==0){
            if(yDiff>0) {
                canvas=LineUtil.drawVerticalLine(point2, point1,canvas,canvasBorder);
            }else{
                canvas=LineUtil.drawVerticalLine(point1, point2,canvas,canvasBorder);
            }

        }else if(yDiff==0){
            if(xDiff>0) {
                canvas=LineUtil.drawHorizontalLine(point2, point1,canvas,canvasBorder);
            }else{
                canvas=LineUtil.drawHorizontalLine(point1, point2,canvas,canvasBorder);
            }
        }
        Util.printCanvasToConsole(canvas);
        return canvas;
    }
}

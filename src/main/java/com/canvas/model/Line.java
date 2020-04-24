package com.canvas.model;

import com.canvas.exception.CanvasException;
import com.canvas.util.LineUtil;
import com.canvas.util.Util;

/**
 *
 */
public class Line extends Shape {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public char[][] draw(char[][] canvas, boolean isBorder) throws CanvasException{
        int xDiff= point1.getXAxisDistance(point2);
        int yDiff= point1.getYAxisDistance(point2);
        if (xDiff !=0 && yDiff!=0){
            throw new CanvasException("Line can only be drawn Horizontally or Vertically");
        }
        if (xDiff==0){
            if(yDiff>0) {
                canvas=LineUtil.drawVerticalLine(point2, point1,canvas,isBorder);
            }else{
                canvas=LineUtil.drawVerticalLine(point1, point2,canvas,isBorder);
            }

        }else if(yDiff==0){
            if(xDiff>0) {
                canvas=LineUtil.drawHorizontalLine(point2, point1,canvas,isBorder);
            }else{
                canvas=LineUtil.drawHorizontalLine(point1, point2,canvas,isBorder);
            }
        }
        Util.printCanvasToConsole(canvas);
        return canvas;
    }
}

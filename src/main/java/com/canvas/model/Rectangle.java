package com.canvas.model;

import com.canvas.exception.CanvasException;
import com.canvas.util.LineUtil;
import com.canvas.util.Util;

public class Rectangle extends Shape {
    Point point1;
    Point point2;
    public Rectangle(Point point1,Point point2){
     this.point1=point1;
     this.point2=point2;
    }

    @Override
    public char[][] draw(char[][] canvas, boolean isBorder) throws CanvasException {
        int xPos1=point1.getX();
        int ypos1=point1.getY();
        int xPos2=point2.getX();
        int ypos2=point2.getY();
        canvas=LineUtil.drawVerticalLine(new Point(xPos1,ypos1),new Point(xPos1,ypos2),canvas,isBorder);
        canvas=LineUtil.drawVerticalLine(new Point(xPos2,ypos1),new Point(xPos2,ypos2),canvas,isBorder);
        canvas= LineUtil.drawHorizontalLine(new Point(xPos1,ypos1),new Point(xPos2,ypos1),canvas,isBorder);
        canvas=LineUtil.drawHorizontalLine(new Point(xPos1,ypos2),new Point(xPos2,ypos2),canvas,isBorder);
        Util.printCanvasToConsole(canvas);
        return canvas;
    }
}

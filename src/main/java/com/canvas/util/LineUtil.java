package com.canvas.util;

import com.canvas.constant.ElementConstant;
import com.canvas.model.Point;

public class LineUtil {

    public static char[][] drawVerticalLine(Point p1, Point p2, char[][] canvas, boolean isBorder) {
        int xPos=p1.getX();
        for(int k=p1.getY();k<=p2.getY();k++) {
            if(isBorder) {
                canvas[k][xPos] = ElementConstant.verticalBoundary;
            }else{
                canvas[k][xPos] = ElementConstant.lineElem;
            }
        }
        return canvas;
    }
    public static char[][] drawHorizontalLine(Point p1, Point p2, char[][] postion, boolean isBorder) {
        for(int k=p1.getX();k<=p2.getX();k++){
            if(isBorder) {
                postion[p1.getY()][k] = ElementConstant.horizontalBoundary;
            }else{
                postion[p1.getY()][k] =  ElementConstant.lineElem;
            }
        }

        return postion;
    }
}

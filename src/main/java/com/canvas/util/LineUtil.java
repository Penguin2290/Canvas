package com.canvas.util;

import com.canvas.constant.ElementConstant;
import com.canvas.model.Point;

/**
 * Util class containing helper methods for Line class
 */
public class LineUtil {

    /**
     * Helper method to draw vertical line in canvas
     * @param p1
     * @param p2
     * @param canvas
     * @param canvasBorder
     * @return
     */
    public static char[][] drawVerticalLine(Point p1, Point p2, char[][] canvas, boolean canvasBorder) {
        int xPos=p1.getX();
        for(int k=p1.getY();k<=p2.getY();k++) {
            if(canvasBorder) {
                canvas[k][xPos] = ElementConstant.verticalBoundary;
            }else{
                canvas[k][xPos] = ElementConstant.lineElem;
            }
        }
        return canvas;
    }

    /**
     * Helper method to draw horizontal line in canvas
     * @param p1
     * @param p2
     * @param postion
     * @param canvasBorder
     * @return
     */
    public static char[][] drawHorizontalLine(Point p1, Point p2, char[][] postion, boolean canvasBorder) {
        for(int k=p1.getX();k<=p2.getX();k++){
            if(canvasBorder) {
                postion[p1.getY()][k] = ElementConstant.horizontalBoundary;
            }else{
                postion[p1.getY()][k] =  ElementConstant.lineElem;
            }
        }

        return postion;
    }
}

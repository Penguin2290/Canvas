package com.canvas.model;

import com.canvas.exception.CanvasException;
import org.junit.Test;


public class RectangleTest {

    @Test
    public void drawTest() throws CanvasException {
        char[][] originalCanvas = new char[22][7];
        for (int i = 0; i< originalCanvas.length; i++){
            for (int k = 0; k< originalCanvas[i].length; k++){
                originalCanvas[i][k]=' ';
            }
        }
        Rectangle rectangle =new Rectangle(new Point(3,2),new Point(5,5));
        rectangle.draw(originalCanvas,true);
    }
}

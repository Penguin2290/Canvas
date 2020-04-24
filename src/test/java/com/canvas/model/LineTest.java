package com.canvas.model;

import com.canvas.exception.CanvasException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LineTest {

    @Test(expected = CanvasException.class)
    public void drawTest() throws Exception{
        char[][] originalCanvas = new char[22][7];
        for (int i = 0; i< originalCanvas.length; i++){
            for (int k = 0; k< originalCanvas[i].length; k++){
                originalCanvas[i][k]=' ';
            }
        }
        Line line = new Line(new Point(2,5),new Point(3,7));
        line.draw(originalCanvas, true);

    }
}

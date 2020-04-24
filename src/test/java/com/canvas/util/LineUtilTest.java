package com.canvas.util;

import com.canvas.model.Point;
import com.canvas.service.CanvasService;
import org.junit.Assert;
import org.junit.Test;

public class LineUtilTest {
    @Test
    public void drawVerticalLineTest(){
        char[][] originalCanvas = new char[22][7];
        for (int i = 0; i< originalCanvas.length; i++){
            for (int k = 0; k< originalCanvas[i].length; k++){
                originalCanvas[i][k]=' ';
            }
        }
        char[][] modifiedCanvas =LineUtil.drawVerticalLine(new Point(1,3),new Point(7,3), originalCanvas,true);
        char exp ='|';
        Assert.assertEquals(exp,modifiedCanvas[3][1]);


    }

    @Test
    public void drawHorizontalLineTest(){
        char[][] originalCanvas = new char[22][7];
        for (int i = 0; i< originalCanvas.length; i++){
            for (int k = 0; k< originalCanvas[i].length; k++){
                originalCanvas[i][k]=' ';
            }
        }
        char[][] modifiedCanvas =LineUtil.drawHorizontalLine(new Point(2,5),new Point(2,7), originalCanvas,true);
        char exp ='|';
        Assert.assertNotEquals(exp,modifiedCanvas[3][1]);


    }


}

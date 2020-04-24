package com.canvas.service;


import com.canvas.exception.CanvasException;
import com.canvas.model.Point;
import org.junit.Assert;
import org.junit.Test;



public class CanvasServiceTest {

    @Test
    public void testDrawLine() throws CanvasException {
        CanvasService c=new CanvasService(10,10);
        c.drawLine(new Point(3,2),new Point(3,4));
       Assert.assertEquals(c.canvas.length,12);
    }

    @Test
    public void testDrawRectangle() throws CanvasException {
        CanvasService c=new CanvasService(10,10);
        c.drawRectangle(new Point(2,2),new Point(5,5),false);
      Assert.assertEquals(c.canvas.length,12);
    }


}

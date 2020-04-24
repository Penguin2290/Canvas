package com.canvas.validation;

import com.canvas.model.Point;
import com.canvas.service.CanvasService;
import org.junit.Assert;
import org.junit.Test;

public class ValidationHelperTest {

    @Test
    public void validateCommandArrLengthTest_true() {
    String[] args = {"C","20","5"};
    boolean pass =ValidationHelper.validateCommandArrLength(args,3);
        Assert.assertEquals(pass,true);

    }

    @Test
    public void validateCommandArrLengthTest_false() {
        String[] args = {"C","20"};
        boolean pass =ValidationHelper.validateCommandArrLength(args,3);
        Assert.assertEquals(pass,false);

    }

    @Test
    public void validatePointsAreWithinBoundaryTest_true(){
        boolean pass =ValidationHelper.validatePointsAreWithinBoundary(new Point(2,1), new Point(3,3),new CanvasService(20,5));
        Assert.assertEquals(pass,true);
    }

    @Test
    public void validatePointsAreWithinBoundaryTest_false(){
        boolean pass =ValidationHelper.validatePointsAreWithinBoundary(new Point(50,1), new Point(3,50),new CanvasService(20,5));
        Assert.assertEquals(pass,false);
    }

    @Test
    public void validateIfThePointRepresentsRectangleTest_true(){
        boolean pass =ValidationHelper.validateIfThePointRepresentsRectangle(new Point(15,2), new Point(20,5));
        Assert.assertEquals(pass,true);
    }

    @Test
    public void validateIfThePointRepresentsRectangleTest_false(){
        boolean pass =ValidationHelper.validateIfThePointRepresentsRectangle(new Point(50,1), new Point(3,50));
        Assert.assertEquals(pass,false);
    }


}


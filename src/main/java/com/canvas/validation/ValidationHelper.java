package com.canvas.validation;

import com.canvas.model.Point;
import com.canvas.service.CanvasService;

/**
 * Validation Helper class to validate user inputs
 */
public class ValidationHelper {

    /**
     * Regex to check if the input is a positive numerical value
     */
    private static String regex = "^[0-9]*[1-9]\\d*$";

    /**
     * Checks if input argument length matches expected length and input is a positive numerical value
     * Expected Length for Canvas : 3
     * Expected length for Line, Rectangle : 5
     * @param commandArr
     * @param expectedLength
     * @return
     */
    public static boolean validateCommandArrLength(String[] commandArr, int expectedLength) {

        if(commandArr.length!=expectedLength){
            int expLength=expectedLength - 1;
            int actualLength=commandArr.length - 1;
            System.out.println("You did not give input in proper format.Expected argument length:"+ expLength +" Actual argument length:"+ actualLength +" Please try again.");
            return false;
        }
        for(int i=1; i< commandArr.length; i++){
            if(!commandArr[i].matches(regex)){
                System.out.println("The input could not be processed. Only positive numerical values are allowed in the the command arguments.");
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether line and rectangle co-ordinates are within the canvas
     * @param p1
     * @param p2
     * @param canvasService
     * @return
     */
    public static boolean validatePointsAreWithinBoundary(Point p1, Point p2, CanvasService canvasService) {

        if(p1.getX() >=canvasService.getBreadth()+1 || p2.getX() >=canvasService.getBreadth() +1||p1.getY() >=canvasService.getHeight()+1 ||p2.getY() >=canvasService.getHeight()+1){
            return false;
        }
        return true;
    }

    /**
     * Checks if the user points valid upper left and lower right co-ordinates of a rectangle
     * @param p1
     * @param p2
     * @return
     */
    public static boolean validateIfThePointRepresentsRectangle(Point p1, Point p2) {

        if(p1.getX() ==p2.getX() || p1.getY() ==p2.getY() || p2.getX()<p1.getX()||p2.getY()<p1.getY()){
            return false;
        }
        return true;
    }


}

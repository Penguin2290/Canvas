package com.canvas.util;
import com.canvas.model.Point;
import com.canvas.service.CanvasService;

public class Util {

   private static String regex = "[0-9]+";
    public static void printCanvasToConsole(char[][] canvas){
        for (int i=0;i<canvas.length;i++){
            System.out.println();
            for (int k =0;k<canvas[i].length;k++){
                System.out.print(canvas[i][k]);
            }
        }
    }

    public static boolean validateCommandArrLength(String[] commandArr, int expectedLength) {

        if(commandArr.length!=expectedLength){
            int expLength=expectedLength - 1;
            int actualLength=commandArr.length - 1;
            System.out.println("You did not give input in proper format.Expected argument length:"+ expLength +" Actual argument length:"+ actualLength +" Please try again.");
            return false;
        }
        for(int i=1; i< commandArr.length; i++){
            if(!commandArr[i].matches(regex)){
                System.out.println("The input could not be processed. Only numerical values are allowed after the command option.");
                return false;
            }
        }
        return true;
    }

    public static boolean validatePointsAreWithinBoundary(Point p1, Point p2, CanvasService canvasService) {

      if(p1.getX() >=canvasService.getBreadth() || p2.getX() >=canvasService.getBreadth() ||p1.getY() >=canvasService.getHeight() ||p2.getY() >=canvasService.getHeight()){
          return false;
      }
        return true;
    }


}

package com.canvas.util;

/**
 * Util class containing helper methods
 */
public class Util {

    /**
     * Method to print canvas to console
     * @param canvas
     */
    public static void printCanvasToConsole(char[][] canvas){
        for (int i=0;i<canvas.length;i++){
            System.out.println();
            for (int k =0;k<canvas[i].length;k++){
                System.out.print(canvas[i][k]);
            }
        }
    }


}

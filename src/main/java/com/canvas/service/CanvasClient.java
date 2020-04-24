package com.canvas.service;

import com.canvas.constant.ErrorConstant;
import com.canvas.exception.CanvasException;
import com.canvas.model.Point;
import com.canvas.util.Util;

import java.util.Scanner;

public class CanvasClient {

    public static void main(String args[]){
        try( Scanner in = new Scanner(System.in);){
            CanvasService canvasService =null;
            System.out.println("Welcome to Canvas Client");
            while (true) {
            try{
                System.out.println("");
                System.out.println("Please choose one of the below options to proceed");
                System.out.println("1.To create a new canvas  of width w and height h, type : C w h ");
                System.out.println("1.To create a new line from (x1,y1) to (x2,y2), type : L x1 y1 x2 y2");
                System.out.println("1.To create a new rectangle with upper left corner at coordinate (x1, y1) and lower right coordinate at (x2, y2), type : R x1 y1 x2 y2");
                System.out.println("1.Quit the program,type: Q");
                System.out.println("Enter the command ");
                String command = in.nextLine();
                String[] commandArr = command.split(" ");
                if (commandArr[0].compareToIgnoreCase("q") == 0) {
                    break;
                } else if (commandArr[0].compareToIgnoreCase("c") == 0) {
                    if (Util.validateCommandArrLength(commandArr, 3)) {
                        canvasService = new CanvasService(Integer.parseInt(commandArr[1]), Integer.parseInt(commandArr[2]));
                        canvasService.drawRectangle(new Point(0, 0), new Point(canvasService.getBreadth() + 1, canvasService.getHeight() + 1), true);
                    } else {
                        continue;
                    }

                } else if (commandArr[0].compareToIgnoreCase("R") == 0) {
                    if (canvasService != null) {
                        if (Util.validateCommandArrLength(commandArr, 5)) {
                            Point p1 = new Point(Integer.parseInt(commandArr[1]), Integer.parseInt(commandArr[2]));
                            Point p2 = new Point(Integer.parseInt(commandArr[3]), Integer.parseInt(commandArr[4]));
                            if(!Util.validatePointsAreWithinBoundary(p1,p2,canvasService)){
                                System.out.println(ErrorConstant.INVALID_ARGUMENT);
                                break;
                            };
                            canvasService.drawRectangle(p1, p2, false);
                        } else {
                            continue;
                        }

                    } else {
                        System.out.println(ErrorConstant.CANVAS_UNINITIALIZED);
                        continue;
                    }

                } else if (commandArr[0].compareToIgnoreCase("l") == 0) {
                    if (canvasService != null) {
                        if (Util.validateCommandArrLength(commandArr, 5)) {
                            Point p1 = new Point(Integer.parseInt(commandArr[1]), Integer.parseInt(commandArr[2]));
                            Point p2 = new Point(Integer.parseInt(commandArr[3]), Integer.parseInt(commandArr[4]));
                            if(!Util.validatePointsAreWithinBoundary(p1,p2,canvasService)){
                                System.out.println(ErrorConstant.INVALID_ARGUMENT);
                                break;
                            };
                            canvasService.drawLine(p1, p2);
                        } else {
                            continue;
                        }

                    } else {
                        System.out.println(ErrorConstant.CANVAS_UNINITIALIZED);
                        continue;
                    }


                } else {
                    System.out.print(ErrorConstant.UNKNOWN_COMMAND);
                }


            } catch(CanvasException e){
                System.out.print("Exception Occured! "+e.getMessage());
                System.out.print("Please retry.");
            }
            }

        }
        catch(Exception e){
            System.out.print(ErrorConstant.UNEXPECTED_EXCEPTION);
        }

    }




}

package com.canvas.model;

import com.canvas.exception.CanvasException;

/**
 * Abstarct class to define various shape objects each having their own draw() implementation
 */
public abstract class Shape {

    /**
     * draw method which is used to fill the canvas, needs to be defined by the implementing class
     * @param canvas
     * @param isBorder
     * @return
     * @throws CanvasException
     */
    public abstract char[][] draw(char[][] canvas, boolean isBorder) throws CanvasException;
}

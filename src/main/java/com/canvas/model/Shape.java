package com.canvas.model;

import com.canvas.exception.CanvasException;

public abstract class Shape {
    public abstract char[][] draw(char[][] canvas, boolean isBorder) throws CanvasException;
}

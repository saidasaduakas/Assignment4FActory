package com.company;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape(){
        return new Rectangle();
    }
}

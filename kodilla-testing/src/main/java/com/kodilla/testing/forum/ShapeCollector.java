package com.kodilla.testing.forum;

import javax.swing.*;
import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> listOfShapes = new ArrayList<>();

    public int addFigure(Shape shape){
            listOfShapes.add(shape);
            return listOfShapes.size();
    }

    public boolean removeFigure(Shape shape){
        if(listOfShapes.contains(shape)) {
            listOfShapes.remove(shape);
            return true;
        }else return false;
    }

    public String getFigure(int i){
        if(listOfShapes.size()>=i){
            return listOfShapes.get(i).drawShape();
        }else return null;
    }

    public void showFigures(){

    }

    public ArrayList<Shape> getListOfShapes() {
        return listOfShapes;
    }
}

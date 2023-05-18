/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.util.Date;
import java.applet.Applet;  
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

/**
 *
 * @author Microsoft
 */
public abstract class Shape {
    private int x1,y1,x2,y2 ;   
	int color ; 
	boolean fillOption ; 
	
	public Shape(int x1, int  y1, int x2, int  y2 , int color , boolean fillOption)
	{
		this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.fillOption = fillOption;
	} 
	public Shape () {} 
	
	
	//Setters 
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    // Getters 
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setShapeColor(int color) {
        this.color = color;
    }

    public int getShapeColor() {
        return color;
    }

    public boolean getFillOption() {
        return fillOption;
    }

    public void setFillOption(boolean fillOption) {
        this.fillOption = fillOption;
    }

	// Implemented by Children
    public void drawShape(Graphics g) {
    }
	
}

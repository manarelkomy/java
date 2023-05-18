/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
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
public class Line extends Shape {
    public Line (int x1, int y1, int x2, int y2, int color, boolean fillOption) 
	{
		super(x1, y1, x2, y2, color, fillOption);
	}  
   
	public Line () {}  
	
	
	
	public void drawShape (Graphics g) 
	{
		switch (getShapeColor () ) 
		{
			case 1 : 
			g.setColor (Color.red);
			break ;  
			case 2 : 
			g.setColor (Color.GREEN); 
			break ;  
			case 3 : 
			g.setColor(Color.BLUE);
			break ;   
			default : 
			g.setColor(Color.BLACK);
			break ;
			
		} 
		g.drawLine(getX1() , getY1() , getX2() , getY2()); 

	}
    
}

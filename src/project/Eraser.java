/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Microsoft
 */
public class Eraser extends Shape{
    public Eraser() {
    }

    public Eraser(int x1, int y1, int x2, int y2, int color, boolean fillOption) {
        super(x1, y1, x2, y2, color, fillOption);
    }

    
    public void drawShape(Graphics g) {
        g.fillOval(getX1(), getY1(),50, 50);
        g.setColor(Color.WHITE);
    }
}

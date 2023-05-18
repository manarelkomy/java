/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Canvas;
import javax.swing.JFrame;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author Microsoft
 */
public class Main {
     public static void main (String[] args){
//        JFrame f= new JFrame();
//        f.setSize(500, 500);
//        f.setTitle("My name with all typs of fonts");
//        Paint p = new Paint();
//        f.setContentPane(p);
//        
JFrame frame = new JFrame("Drawing Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Draw panel = new Draw();
        frame.setContentPane(panel);
        frame.setVisible(true);
        
    }
    
}

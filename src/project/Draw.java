/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Microsoft
 */
public class Draw extends JPanel implements MouseMotionListener, MouseListener{
    // Initializations 
        
	    Button ovalButton;
		Button rectButton;
		Button freeHandButton;
		Button lineButton;
		Button redButton;
		Button greenButton;
		Button blueButton;
		Button eraserButton;
		Button clearAllButton;
		Button undoButton;
	    Checkbox filledButton;  
		
		int x1, x2, y1, y2;
		boolean fillOption = false; // filled or not filled   
		int selectedShape;
        int selectedColor;
		Line line ;  
        Rectangle rect;		 
		Oval oval ;  
		Eraser eraser ; 
		ArrayList<Shape> shapes;
		Graphics g ;
		
	public  Draw () 
	{   
	    shapes = new ArrayList<Shape>();
		line = new Line(); 
		rect = new Rectangle();  
		oval = new Oval(); 
		eraser = new Eraser ();
	    addMouseListener(this);
        addMouseMotionListener(this); 
		ovalButton = new Button("Oval");
        rectButton = new Button("Rectangle");
        freeHandButton = new Button("Free Hand");
        lineButton = new Button("Line");
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");
        eraserButton = new Button("Eraser");
        clearAllButton = new Button("Clear All");
        filledButton = new Checkbox("Fill Shape", fillOption);
        undoButton = new Button("Undo");  
		
		redButton.setBackground(Color.red);
        greenButton.setBackground(Color.GREEN);
        blueButton.setBackground(Color.BLUE);  
		
		add(ovalButton);
        add(rectButton);
        add(freeHandButton);
        add(lineButton);
        add(redButton);
        add(greenButton);
        add(blueButton);
        add(eraserButton);
        add(clearAllButton);
        add(undoButton);
        add(filledButton);  
        
 ovalButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = 1;
            }
        });
		 rectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = 2;
            }
        }); 
		
		  freeHandButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = 3;
            }
        });
		
		// Shapes ActionListener
		 lineButton.addActionListener(new ActionListener() {

           
            public void actionPerformed(ActionEvent e) {
                selectedShape = 4;
            }
        });   
		
		eraserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedShape = 5;
            }
        });
		
		//Colors ActionListener
		 redButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = 1;
            }
        });

        greenButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = 2;
            }
        });

        blueButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                selectedColor = 3;
            }
        });   
		filledButton.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                fillOption = filledButton.getState();
            }
        }); 
		clearAllButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                shapes.clear();
                switch (selectedShape) {
                    case 1:
                        oval.setX1(0);
                        oval.setY1(0);
                        oval.setX2(0);
                        oval.setY2(0);
                        break;
                    case 2:
                        rect.setX1(0);
                        rect.setY1(0);
                        rect.setX2(0);
                        rect.setY2(0);
                        break;
                    case 4:
                        line.setX1(0);
                        line.setY1(0);
                        line.setX2(0);
                        line.setY2(0);
                        break;

                }
                repaint();
            }
        });  
		
		undoButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (shapes.size() > 0) {
                    shapes.remove(shapes.size() - 1);
                    switch (selectedShape) {
                        case 1:
                            oval.setX1(0);
                            oval.setY1(0);
                            oval.setX2(0);
                            oval.setY2(0);
                            break;
                        case 2:
                            rect.setX1(0);
                            rect.setY1(0);
                            rect.setX2(0);
                            rect.setY2(0);
                            break;
                        case 4:
                            line.setX1(0);
                            line.setY1(0);
                            line.setX2(0);
                            line.setY2(0);
                            break;

                    }
                    repaint();
                }
            }
        });
		
	} // end of init scope  
	
            @Override
	    public void paintAll(Graphics g )
		{  
		    for (int i = 0; i < shapes.size(); i++) {
                        
                        shapes.get(i);
                        super.paint(g);
                        
                    
            }  
		   switch (selectedShape) { 
		    case 1:
                oval.setShapeColor(selectedColor); 
				oval.setFillOption(fillOption) ; 
				oval.drawShape(g); 
				break;
            case 2:
                rect.setShapeColor(selectedColor); 
				rect.setFillOption(fillOption) ; 
				rect.drawShape(g); 
				break;
            case 4:
                line.setShapeColor(selectedColor); 
				line.setFillOption(fillOption) ; 
				line.drawShape(g); 
				break; 
			case 5:
                eraser.drawShape(g);
                break;
               
        }
                }
    @Override
    public void mouseDragged(MouseEvent e) {
         x2 = e.getX();
             y2 = e.getY();  
			 
			 switch (selectedShape) { 
			  case 1:
                oval.setX2(x2);
                oval.setY2(y2);
             case 2:
                rect.setX2(x2);
                rect.setY2(y2);
             case 4:
                line.setX2(x2);
                line.setY2(y2); 
			
				
		}  
		repaint() ;
          }

    @Override
    public void mouseMoved(MouseEvent e) {
          }

    @Override
    public void mouseClicked(MouseEvent e) {
      }

    @Override
    public void mouseReleased(MouseEvent e) {
         switch (selectedShape) {
            case 1:
                shapes.add((Shape) new Oval(x1, y1, x2, y2, selectedColor, fillOption));
                break;
            case 2:
                shapes.add((Shape) new Rectangle(x1, y1, x2, y2, selectedColor, fillOption));
                break;
            case 4:
                shapes.add((Shape) new Line(x1, y1, x2, y2, selectedColor, fillOption));
                break;  
			case 5 : 
				 eraser.setX2(x2);
                eraser.setY2(y2);  
				shapes.add((Shape) new Eraser(x1, y1, 50, 50, selectedColor, fillOption));   
                break;				
			
        }
			
         }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
       }
    @Override
    public void mousePressed(MouseEvent e) {
         x1 = e.getX();
             y1 = e.getY();  
			 
			 switch (selectedShape) { 
			  case 1:
                oval.setX1(x1);
                oval.setY1(y1); 
				break;
            case 2:
                rect.setX1(x1);
                rect.setY1(y1); 
				break;
             case 4:
                line.setX1(x1);
                line.setY1(y1); 
				break; 
			 case 5:
                eraser.setX1(x1);
                eraser.setY1(y1); 
				//shapes.add(new Eraser(x1, y1, 50, 50, selectedColor, fillOption));
                break;  
               
        }
        }
    
}


import javax.swing.JOptionPane;
import processing.core.PApplet;
import g4p_controls.*;

public class FaceInterface extends PApplet {
    Face f;
    GButton button1;
    GButton button2;
    GButton button3;
    GButton button4;
    float x,y;
    float R,G,B;
    
    public void setup() {
        setSize(400,400);
        background(255);
        f=new Face(this,200,200);
        button1=new GButton(this, 22,20,80,30);
        button1.setText("Move Face");
        button2=new GButton(this, 119,20,80,30);
        button2.setText("Resize Face");
        button3=new GButton(this, 217,20,80,30);
        button3.setText("Cange Color");
        button4=new GButton(this, 311,20,80,30);
        button4.setText("Set Mood");
    }
    
    public void handleButtonEvents(GButton button, GEvent event){
        if(button==button1){
            x=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new x: "));
            y=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new y: "));
            f.erase();
            f.move(x,y);
        }
        if(button==button2){
            
        }
        if(button==button3){
            R=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new red: "));
            G=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new green: "));
            B=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new blue: "));
            f.setColor(R, G, B);
            f.erase();
        }
        if(button==button4){
            
        }
    }
    
    public void draw(){
        f.draw();
    }
    public static void main(String[] args) {
        PApplet.main("FaceInterface");
    }

}

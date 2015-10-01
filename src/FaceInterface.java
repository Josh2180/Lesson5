
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
    
    public void setup() {
        setSize(400,400);
        background(255);
        f=new Face(this,200,200);
        button1=new GButton(this, 22,20,80,30);
        button1.setText("Move Face");
        button1=new GButton(this, 199,20,80,30);
        button1.setText("Resize Face");
        button1=new GButton(this, 217,20,80,30);
        button1.setText("Cange Color");
        button1=new GButton(this, 311,20,80,30);
        button1.setText("Set Mood");
    }
    
    public void handleButtonEvents(GButton button, GEvent event){
        if(button==button1){
            x=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new x: "));
            y=Float.parseFloat(JOptionPane.showInputDialog(this,"Enter new y: "));
            f.erase();
            f.move(x,y);
        }
    }
    
    public void draw(){
        f.draw();
    }

}

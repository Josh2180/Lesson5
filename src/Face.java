
import java.awt.Color;
import processing.core.PApplet;

public class Face {

    private float xpos, ypos, radius;
    private Color color;

    private PApplet pen;

    public Face(PApplet p, float x, float y) {
        xpos = x;
        ypos = y;
        radius = 100;
        color = Color.red;
        pen = p;
    }

    public void draw() {
        pen.stroke(0);
        pen.fill(color.getRed(), color.getGreen(), color.getBlue());
        drawCircle(xpos, ypos, radius, radius);
        pen.fill(255, 255, 255);
        drawCircle(xpos - radius / 5, ypos - radius / 5, radius / 4, radius / 4);
        drawCircle(xpos + radius / 5, ypos - radius / 5, radius / 4, radius / 4);
        drawLine(xpos - .2 * radius, ypos + .3 * radius, xpos + .20 * radius, ypos + .3 * radius);
        drawLine(xpos - .2 * radius, ypos + .3 * radius, xpos - .25 * radius, ypos + .2 * radius);
        drawLine(xpos + .2 * radius, ypos + .3 * radius, xpos + .25 * radius, ypos + .2 * radius);
    }

    private void drawCircle(float x, float y, float wid, float ht) {
        pen.ellipse(x, y, wid, ht);
    }

    private void drawLine(double x1, double y1, double x2, double y2) {
        pen.line((float) x1, (float) y1, (float) x2, (float) y2);
    }

    public void erase() {
        pen.fill(255);
        pen.noStroke();
        pen.ellipse(xpos, ypos, radius + 5, radius + 5);
    }
}

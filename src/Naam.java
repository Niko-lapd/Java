import java.applet.Applet;
import java.awt.*;

public class Naam extends Applet {
    public void init() {
        setBackground(Color.BLUE);
    }
    public void paint(Graphics graphics){
        graphics.setColor(Color.yellow);
        graphics.drawString("Niko",50,50);
    }
}

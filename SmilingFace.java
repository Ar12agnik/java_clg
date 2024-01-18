import java.applet.*;
import java.awt.*;

public class SmilingFace extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);
        g.setColor(Color.BLACK);
        g.drawArc(100, 120, 100, 80, 0, -180);
    }
}/*<applet code=SmilingFace.java height=400 width=400></applet> */
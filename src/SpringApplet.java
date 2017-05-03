import javax.swing.*;
import java.awt.*;

public class SpringApplet extends JApplet
{
    public void init()
    {
        setBackground(Color.black);

    }
    public void paint(Graphics g)
    {
        Vector2D wektor1 = new Vector2D(5,9);
        Vector2D wektor2 = new Vector2D(2,-4);



    }

    public void RysowanieLinii(Graphics g, Vector2D wektor){
        double x = wektor.x;
        double y = wektor.y;
        //g.drawLine(getSize().width/2,getSize().height/2, getSize().width/2);

    }

}

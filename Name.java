import java.awt.*;
import java.applet.Applet;
public class Name extends Applet {
    public void paint(Graphics g)
    {
        setBackground(Color.magenta);
        setForeground(Color.BLACK);
        g.setFont(new Font("Bodoni MT Black",Font.ITALIC,30));
        g.drawString("Hemant", 100, 100);

        g.setColor(Color.YELLOW);
        Font f1=new Font("Arial",Font.BOLD+Font.ITALIC,30);
        g.setFont(f1);
        g.drawString("Hemant", 100,150);

        g.setColor(Color.BLUE);
        Font f2=new Font("Times new roman",Font.BOLD,30);
        g.setFont(f2);
        g.drawString("Hemant", 100,200);

        g.setColor(Color.GREEN);
        Font f3=new Font("Helvetica",Font.BOLD+Font.ITALIC,30);
        g.setFont(f3);
        g.drawString("Hemant", 100,250);

        g.setColor(Color.RED);
        Font f4=new Font("Ms scan",Font.BOLD+Font.ITALIC,30);
        g.setFont(f4);
        g.drawString("Hemant", 100,300);

        g.setColor(Color.WHITE);
        Font f5=new Font("Algerian",Font.BOLD+Font.ITALIC,40);
        g.setFont(f5);
        g.drawString("Hemant", 100,350);

        g.setColor(Color.cyan);
        Font f6=new Font("comic",Font.BOLD+Font.ITALIC,30);
        g.setFont(f6);
        g.drawString("Hemant", 100,400);

        g.setColor(Color.gray);
        Font f7=new Font("caliographic",Font.BOLD+Font.ITALIC,30);
        g.setFont(f7);
        g.drawString("Hemant", 100,450);

        g.setColor(Color.ORANGE);
        Font f8=new Font("Viner Hand ITC",Font.BOLD+Font.ITALIC,30);
        g.setFont(f8);
        g.drawString("Hemant", 100,500);

        g.setColor(Color.PINK);
        Font f9=new Font("Papyrus",Font.BOLD+Font.ITALIC,30);
        g.setFont(f9);
        g.setColor(Color.yellow);
        g.drawString("Hemant", 100,50);

    }
}
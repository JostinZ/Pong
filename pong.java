import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.Graphics;

public class pong extends JFrame {

    int screenWidth = 1500;
    int screenHeight = 980;

    Image dbImage;
	Graphics dbGraphics;

    public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbGraphics = dbImage.getGraphics();
		draw(dbGraphics);
		g.drawImage(dbImage, 0, 0, this);
	}

    public void draw(Graphics g) {
		// b.draw(g);
		// b.p1.draw(g);
		// b.p2.draw(g);
		
		// g.setColor(Color.WHITE);
		// g.drawString(""+b.p1score, 15, 20);
		// g.drawString(""+b.p2score, 385, 20);
		
		// repaint();
	}

    Dimension screenSize = new Dimension(screenWidth, screenHeight);

    //static ball b = new ball(50,50);

    public pong(){
        this.setTitle("PONG");
		this.setSize(screenSize);
		this.setResizable(false);
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.addKeyListener(new AL());

        
    }

}
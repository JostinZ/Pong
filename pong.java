import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Line2D;
// import java.awt.image.BufferedImage;

public class pong extends JFrame implements Runnable, KeyListener, ActionListener {
    static boolean button_up = false, button_down = false;
    static boolean player_2_button_up = false, player_2_button_down = false;
    int paddle1_y = 160;
    int paddle2_y = 160;
    int ball_x = 10;
    int ball_y = 10;
    double ball_dx = 1;
    double ball_dr = 1;
    final int WIDTH = 800;
    final int HEIGHT = 600;
    JButton button;
 
    public void keyTyped(KeyEvent e) {}

    public void focusItem(final JFrame frame) {
        EventQueue.invokeLater(new Runnable() {
            public void run() { frame.requestFocus(); }
        });
    }


    public void keyReleased(KeyEvent r) {
        if (r.getKeyCode() == KeyEvent.VK_W) {
            button_up = false;
        }

        if (r.getKeyCode() == KeyEvent.VK_S) {
            button_down = false;
        }

        if (r.getKeyCode() == KeyEvent.VK_UP) {
            player_2_button_up = false;
        }

        if (r.getKeyCode() == KeyEvent.VK_DOWN) {
            player_2_button_down = false;
        }
    }

    public void keyPressed(KeyEvent r) {

        if (r.getKeyCode() == KeyEvent.VK_W) {
            button_up = true;
        }

        if (r.getKeyCode() == KeyEvent.VK_S) {
            button_down = true;
        }

        if (r.getKeyCode() == KeyEvent.VK_UP) {
            player_2_button_up = true;
        }

        if (r.getKeyCode() == KeyEvent.VK_DOWN) {
            player_2_button_down = true;
        }
    }
    
    public void paint(Graphics g) {
        Image backGround = createImage(getWidth(), getHeight());
        Graphics bg = backGround.getGraphics();
        bg.setColor(new Color(200, 200, 200));
        bg.fillOval(ball_x, ball_y, 10, 10);

        Graphics renderPaddle = backGround.getGraphics();
        renderPaddle.setColor(Color.red);
        renderPaddle.fillRect(75, paddle1_y, 10, 50);
        renderPaddle.setColor(Color.blue);
        renderPaddle.fillRect(725, paddle2_y, 10, 50);

        Graphics colorBg = backGround.getGraphics();
        colorBg.setColor(new Color(0, 255, 255));

        g.drawImage(backGround, 0, 0, this);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(Color.white);
		g2.drawRect(10,33,777,555);
        g2.drawLine(400,0,400,600);
        g2.drawOval(300,200,200,200);
        g2.drawRect(10,200,100,200);
        g2.drawRect(690,200,100,200);


        repaint();
        
    }

    public void run() {
        while (true) {
            ball_x += ball_dx;
            ball_y += ball_dr;
            if (ball_x + ball_dx > WIDTH - 10 || ball_x + ball_dx < 0) {
                ball_dx = -ball_dx;
            }
            if (ball_y + ball_dr > HEIGHT - 20 || ball_y + ball_dr < 25) {
                ball_dr = -ball_dr;
            }

            if (button_down == true) {
                paddle1_y = paddle1_y + 2;
            }
            if (button_up == true) {
                paddle1_y = paddle1_y - 2;
            }

            if (player_2_button_down == true) {
                paddle2_y = paddle2_y + 2;
            }
            if (player_2_button_up == true) {
                paddle2_y = paddle2_y - 2;
            }

            // repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
            }
				
            // if (( ball_y >= 200 && ball_y <= 358)){
            //     System.out.println("ball is there");
            // }

            if ((ball_x <= 10 && (ball_y >= 200 && ball_y <= 358 )) || (ball_x >= 785 && (ball_y >= 200 && ball_y <= 358 )))  {
                if (ball_x <= 10){
					JOptionPane.showMessageDialog(
						null, "<html><h1><b>player2 wins!!!</b></h1></html>"
					);
				}
				if (ball_x >= 785){
					JOptionPane.showMessageDialog(
						null, "<html><h1><b>player1 wins!!!</b></h1></html>"
					);
				}

                button_up = false;
                button_down = false;
                player_2_button_up = false;
                player_2_button_down = false;
                ball_x = this.getWidth() / 2;
                ball_y = this.getHeight() / 2;
                ball_dx = 1;
                ball_dr = 1;
                paddle1_y = 160;
                paddle2_y = 160;
            }

            // Needs to be reworked
            if (ball_dx > 0 && ball_x > 715 && ball_y > paddle2_y && ball_y < paddle2_y + 50) {
                ball_dx = -ball_dx;
            }

            if (ball_dx < 0 && ball_x < 85 && ball_y > paddle1_y && ball_y < paddle1_y + 50) {
                ball_dx = -ball_dx;
                }
        }
        }
        
    public pong() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(0,110,31));
        this.setVisible(true);
        this.setBounds(200, 200, WIDTH, HEIGHT);
        ball_x = this.getWidth() / 2;
        ball_y = this.getHeight() / 2;
        Thread th = new Thread(this);
        th.start();
        this.addKeyListener(this);
        focusItem(this);
    }
 
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            this.dispose();
        }
    }

}
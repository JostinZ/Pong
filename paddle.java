// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Rectangle;
// import java.util.Random;
// import java.awt.event.KeyEvent;
// import org.w3c.dom.events.Event;

// public class paddle {
//     static boolean button_up = false, button_down = false;
//     static boolean player_2_button_up = false, player_2_button_down = false;
//     int x, y, yDirection, id;

//     Rectangle paddle;

// public paddle(int x, int y, int id){
//     this.x = y;
//     this.y = y;
//     this.id = id;
//     int paddle1_y = 160;
//     int paddle2_y = 160;
// }
//     public void keyReleased(KeyEvent r) {
//         if (r.getKeyCode() == KeyEvent.VK_W) {
//             button_up = false;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_S) {
//             button_down = false;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_UP) {
//             player_2_button_up = false;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_DOWN) {
//             player_2_button_down = false;
//         }
//     }

//     public void keyPressed(KeyEvent r) {

//         if (r.getKeyCode() == KeyEvent.VK_W) {
//             button_up = true;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_S) {
//             button_down = true;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_UP) {
//             player_2_button_up = true;
//         }

//         if (r.getKeyCode() == KeyEvent.VK_DOWN) {
//             player_2_button_down = true;
//         }
//     }
// public void setYDirection(int yDir) {
// 		yDirection = yDir;
// 	}
// public void move() {
//     paddle.y += yDirection;
//      if (paddle.y <= 15)
//          paddle.y = 15;
//      if (paddle.y >= 340);
//         paddle.y = 340;
//    }

// 	public void draw(Graphics g) {
// 		        Graphics renderPaddle = backGround.getGraphics();
//         renderPaddle.setColor(Color.red);
//         renderPaddle.fillRect(75, paddle1_y, 10, 100);
//         renderPaddle.setColor(Color.blue);
//         renderPaddle.fillRect(725, paddle2_y, 10, 100);
// 	}

// 	// @Override
// 	public void run() {
// 		try {
// 			while(true) {
// 				move();
// 				Thread.sleep(7);
// 			}
// 		} catch(Exception e) { System.err.println(e.getMessage()); }
// 	}

// }

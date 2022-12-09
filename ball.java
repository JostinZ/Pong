
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class ball {
    int x;
    int y;
    int xDirection;
    int yDirection;
	Rectangle r;
	
	int p1score, p2score = 0;
	
	paddle p1 = new paddle(10, 25, 1);
	paddle p2 = new paddle(485, 25, 2);
	
	// Rectangle ball;
public ball(int x, int y){
    // p1score = p2score = 0;
    this.x = x;
    this.y = y;
    //set the ball to move randomly 
    //
    //
    

   r = new Rectangle(this.x, this.y, 25,25);
}
public void setXDirection(int xdirect){
    xDirection = xdirect;
}
public void setYDirection(int ydirect){
    yDirection = ydirect;
}
public void draw(Graphics g){
    g.setColor(Color.WHITE);
    g.fillRect(this.x, this.y, 25, 25);
}
public void collision(){
    // wait for paddle 1 and 2
    //
    //
    //
    //
    //
}
public void moveball(){
    collision();
    x += xDirection;
    y += yDirection;

    //if (ball.x <= # for player 1){
        //setXDirection(+1);
        //p2score++';'
    //}
    
    // if(ball.y <= #bottom of screen + 10){
    //     setYDirection(+1);
    // }
    // if (ball.y >= #top of screen - 10){
    //     setYDirection(-1);
    // }
    //}
}





}

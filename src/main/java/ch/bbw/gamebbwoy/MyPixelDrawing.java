package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.ButtonListener;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.bbw.gamebbwoy.api.PixelDrawing;
import ch.bbw.gamebbwoy.internal.GameBbwoy;

import java.io.Serializable;

public class MyPixelDrawing implements Serializable, PixelDrawing, ButtonListener {

	double jumpHeight;
	double jumpSpeed;

	Ball ball = new Ball(10,20);
	Ball ball2	= new Ball(23,54);

	Player player1 = new Player(15, 15);

	Shoot shoot;

	public static void main(String[] args) throws Throwable {
		GameBbwoy.playGame(new MyPixelDrawing());
	}

	 int getPixelWidth() {
		return 160;
	}

	/**
	 * @return The screen height (Höhe) in pixels. Corresponds to the y-coordinate.
	 */
	int getPixelHeight() {
		return 144;
	}









void pixelBall(PixelDisplay graphic){

}

	@Override
	public void onButtonPress(GameButton button){
		if (button == GameButton.W){
			player1.move(0,-1);
		}
		if (button == GameButton.A){
			player1.move(-1,0);
		}
		if (button == GameButton.S) {
			player1.move(0,1);
		}
		if (button == GameButton.D) {
			player1.move(1,0);
		}
		if (button == GameButton.UP){
			shoot.v0++;
		}


		if (button == GameButton.SPACE){
			shoot = new Shoot(10, 45, ball, player1.getxPos(), player1.getyPos());
		}

	}

	@Override
	public void onButtonRelease(GameButton button) {

	}

	@Override
	public void tick(PixelDisplay graphic) {
		graphic.clear();
		player1.playerRender(graphic);
		//ball.render(graphic);
		ball2.render(graphic);
		if (shoot != null){
			shoot.render(graphic);
		}


	}
}

package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.ButtonListener;
import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.bbw.gamebbwoy.api.PixelDrawing;
import ch.bbw.gamebbwoy.internal.GameBbwoy;

import java.io.Serializable;
import java.util.List;

public class MyPixelDrawing implements Serializable, PixelDrawing, ButtonListener {

	double jumpHeight;
	double jumpSpeed;

	public static void main(String[] args) throws Throwable {
		GameBbwoy.playGame(new MyPixelDrawing());
	}

	public int xOffset = 0;
	public int yOffset = 0;









void Player1(PixelDisplay graphic){
		var list = List.of(
				0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 2, 3, 3, 3, 0, 0, 0, 0, 0,
	0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 3, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 1, 3, 0, 2, 0, 3, 0, 0, 0,
	0, 0, 0, 0, 0, 3, 2, 3, 0, 0, 3, 0, 0, 0, 0,
	0, 0, 0, 0, 0, 0, 3, 1, 1, 2, 2, 3, 0, 0, 0,
	0, 0, 0, 0, 0, 0, 3, 1, 1, 2, 1, 3, 0, 0, 0,
	0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 3, 2, 3, 0, 0,
	0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 3, 1, 3, 0, 0,
	0, 0, 0, 0, 0, 0, 3, 1, 3, 3, 1, 3, 0, 0, 0,
	0, 0, 0, 0, 0, 0, 3, 2, 3, 3, 2, 3, 0, 0, 0,
	0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		);


		for(int x = 0; x <15; x++){
			for (int y = 0; y<15; y++){
				graphic.setPixel(1 + x + xOffset,1 + y + yOffset,
						PixelColor.fromValue(list.get(x+y*15)));

			}
	}
}





	@Override
	public void onButtonPress(GameButton button){
		System.out.println(button);
		if (button == GameButton.W){
			yOffset-=1;
		}
		if (button == GameButton.A){
			xOffset-=1;
		}
		if (button == GameButton.S) {
			yOffset+=1;
		}
		if (button == GameButton.D) {
			xOffset += 1;
		}
		if (button == GameButton.SPACE){
			jumpSpeed = 3;
		}
	}










	@Override
	public void onButtonRelease(GameButton button) {

	}

	@Override
	public void tick(PixelDisplay graphic) {
		graphic.clear();
		Player1(graphic);
	}
}

package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.ButtonListener;
import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.bbw.gamebbwoy.api.PixelDrawing;
import ch.bbw.gamebbwoy.internal.GameBbwoy;

import java.util.List;

public class MyPixelDrawing implements PixelDrawing, ButtonListener {

	public static void main(String[] args) throws Throwable {
		GameBbwoy.playGame(new MyPixelDrawing());
	}

	@Override
	public void tick(PixelDisplay graphic) {
		//graphic.clear();


		var list = List.of(
				0, 0, 0, 1, 1, 1, 1, 0, 0, 0,
				0, 0, 1, 0, 0, 0, 0, 1, 0, 0,
				0, 1, 0, 0, 0, 0, 0, 0, 1, 0,
				1, 0, 0, 3, 0, 0, 3, 0, 0, 1,
				1, 0, 0, 0, 0, 0, 0, 0, 0, 1,
				1, 0, 0, 0, 0, 0, 0, 0, 0, 1,
				1, 0, 0, 3, 0, 0, 3, 0, 0, 1,
				0, 1, 0, 0, 3, 3, 0, 0, 1, 0,
				0, 0, 1, 0, 0, 0, 0, 1, 0, 0,
				0, 0, 0, 1, 1, 1, 1, 0, 0, 0
		);


		for(int x = 0; x <10; x++){
			for (int y = 0; y<10; y++){
				graphic.setPixel(40 + x,50 + y,
						PixelColor.fromValue(list.get(x+y*10)));
			}
		}
		// sets a pixel top left

	}

	@Override
	public void onButtonPress(GameButton button) {

	}

	@Override
	public void onButtonRelease(GameButton button) {

	}
}

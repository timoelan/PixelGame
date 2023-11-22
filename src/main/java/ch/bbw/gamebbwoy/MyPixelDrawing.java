package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.ButtonListener;
import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.bbw.gamebbwoy.api.PixelDrawing;
import ch.bbw.gamebbwoy.internal.GameBbwoy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.util.List;

public class MyPixelDrawing implements Serializable, PixelDrawing, ButtonListener {

	public static void main(String[] args) throws Throwable {
		GameBbwoy.playGame(new MyPixelDrawing());
	}

	public int x_offset = 0;
	public int y_offset = 0;
	public int n_y_offset = 0;
	public int n_x_offset = 0;

	@Override
	public void tick(PixelDisplay graphic) {
		graphic.clear();
		Player1(graphic);




		}

void Map(PixelDisplay graphic){
		var list = List.of();
}

void Player2(PixelDisplay graphic){
		var list = List.of(

		);
}



	void Player1(PixelDisplay graphic){
		var list = List.of(

				0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 3, 0, 3, 3, 0, 0, 0, 0,
				0, 0, 0, 0, 3, 1, 1, 1, 3, 1, 1, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 3, 2, 3, 3, 0, 1, 0, 3, 0, 0,
				0, 0, 0, 0, 0, 3, 1, 3, 3, 2, 2, 3, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 1, 1, 1, 1, 1, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 1, 1, 1, 1, 1, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 1, 1, 1, 3, 1, 3, 0,
				0, 0, 0, 0, 0, 0, 0, 3, 1, 1, 1, 3, 2, 3, 0,
				0, 0, 0, 0, 0, 0, 3, 1, 3, 3, 3, 1, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 3, 2, 3, 0, 3, 2, 3, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		);


		for(int x = 0; x <15; x++){
			for (int y = 0; y<15; y++){
				graphic.setPixel(1 + x + x_offset,1 + y + y_offset,
						PixelColor.fromValue(list.get(x+y*15)));

			}
	}
}

	@Override
	public void onButtonPress(GameButton button){
		System.out.println(button);
		if (button == GameButton.W){
			y_offset-=1;
		}
		if (button == GameButton.A){
			x_offset-=1;
		}
		if (button == GameButton.S) {
			y_offset+=1;
		}
		if (button == GameButton.D) {
			x_offset += 1;
		}
	}










	@Override
	public void onButtonRelease(GameButton button) {

	}
}

package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;

import java.util.List;

public class Ball {
    List<Integer> pixels = List.of(3,3,3,
            3,3,3,
            3,3,3);

    int xPos = 0;
    int yPos = 0;

    public Ball(int initialX, int initialY){
        yPos = initialY;
        xPos = initialX;
    }
    public void renderMove(int xOffset, int yOffset){
        xPos = xOffset;
        yPos = yOffset;
    }

    public void render(PixelDisplay graphic) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                graphic.setPixel(1 + x + xPos, 1 + y + yPos,
                        PixelColor.fromValue(pixels.get(x + y * 3)));
            }
        }
    }
   /* void setPixelIgnoreOutOfBounds(PixelDisplay graphic, int x, int y, PixelColor Pixel) {
        if (x < 0 || graphic.getPixelWidth() <= x) {
            return;
       }
        if (y < 0 || graphic.getPixelWidth() <= y) {
            return;
        }

        graphic.setPixel(x, y, pixel);
    }*/
}
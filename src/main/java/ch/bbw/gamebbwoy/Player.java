package ch.bbw.gamebbwoy;

import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;

import java.util.List;

public class Player {


    public Player(int initialX, int initialY){
        xPos = initialX;
        yPos = initialY;
    }
    public void move(int xOffset, int yOffset){
        xPos += xOffset;
        yPos += yOffset;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    int xPos = 0;
    int yPos = 0;
    List<Integer> pixels = List.of(
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
    void playerRender(PixelDisplay graphic){
        for (int x = 0; x < 15; x++) {
            for (int y = 0; y < 15; y++) {
                graphic.setPixel(1 + x + xPos, 1 + y + yPos,
                        PixelColor.fromValue(pixels.get(x + y * 15)));

            }
        }
    }
}

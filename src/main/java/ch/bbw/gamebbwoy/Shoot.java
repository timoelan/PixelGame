package ch.bbw.gamebbwoy;


import ch.bbw.gamebbwoy.api.PixelColor;
import ch.bbw.gamebbwoy.api.PixelDisplay;
import ch.timo.physics.Physics;

import java.util.ArrayList;
import java.util.List;


public class Shoot {





    public Shoot (int v0, int angle, Ball ball, int initialX, int initialY){
        this.v0 = v0;
        this.angle = angle;
        this.ball = ball;
        this.initialX = initialX;
        this.initialY= initialY;

        calculateParable();

    }
    void calculateParable (){
        for (int x = -20; x < 20; x++){

                    parable.add(Physics.parabolicThrowing(x, v0, angle));
        }

    }
    public int v0 = 0;
    int angle = 45;
    Ball ball;

    int initialX = 0;
    int initialY = 0;

    public boolean isFinished() {
        return finished;
    }

    boolean finished = false;

    List<Double> parable = new ArrayList<Double>();

    int saveRender = 0;
    void render(PixelDisplay graphic){
        System.out.println(ball.yPos + " that is the y Pos");
        if (!finished){
        if (saveRender < parable.size()) {
            if(ball.yPos < 2){
                System.out.println("geht oben raus");
                finished = true;
                return;
            }

            if (ball.yPos > graphic.getPixelHeight() - 20) {
                finished = true;
                return;
            }
            if (ball.xPos > graphic.getPixelWidth() - 20) {
                finished = true;
                System.out.println(finished + " is it finished?");
                return;
            }
            int y = parable.get(saveRender).intValue() * -1 + parable.get(0).intValue();
            System.out.println("                     ");
            System.out.println(saveRender + " = saveRender");
            ball.renderMove(saveRender + initialX, y + initialY);
            ball.render(graphic);
            System.out.println(graphic.getPixelHeight() + " pixel Height");
            System.out.println(graphic.getPixelWidth() + " pixel Width");
            System.out.println("                     ");
            System.out.println(ball.xPos + " ball xPos");
            System.out.println(ball.yPos + " ball yPos");
            System.out.println("                     ");
            System.out.println(y);
            saveRender++;
        }
        }
    }


}


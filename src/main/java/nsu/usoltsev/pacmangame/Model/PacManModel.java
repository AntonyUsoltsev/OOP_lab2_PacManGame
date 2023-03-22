package nsu.usoltsev.pacmangame.Model;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import nsu.usoltsev.pacmangame.View.PacManView;

public class PacManModel {
    private int xVelocity;
    private int yVelocity;
    private int xPosition;
    private int yPosition;
    private String direction;
    private PacManView pacManView;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public PacManModel(int xVelocity, int yVelocity, int xPosition, int yPosition, String direction, Group root) {
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        pacManView = new PacManView(root);
    }

    public void movement() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (xPosition == 560) {
                    xPosition = (-20);
                } else if (xPosition < 10 && yPosition > 10 && yPosition < 200 && xVelocity < 0) {
                    xVelocity = 0;
                    // pacMan.setX(560);
                }

                if (yPosition == 560) {
                    yPosition = (-20);
                } else if (yPosition == -20) {
                    yPosition = (560);
                }
                xPosition += xVelocity;
                yPosition += yVelocity;
                pacManView.viewPacMan(xPosition, yPosition, direction);
            }
        };
        timer.start();

    }


}

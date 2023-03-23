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

    private int xVelocityChange;
    private int yVelocityChange;

    public void setxVelocityChange(int xVelocityChange) {
        this.xVelocityChange = xVelocityChange;
    }

    public void setyVelocityChange(int yVelocityChange) {
        this.yVelocityChange = yVelocityChange;
    }

    public void setKeyPressed(String keyPressed) {
        this.keyPressed = keyPressed;
    }

    private String keyPressed;
    private final PacManView pacManView;

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

        this.xVelocityChange = 0;
        this.yVelocityChange = 0;
        this.keyPressed = "RIGHT";
        pacManView = new PacManView(root);
    }

    public void movement() {

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                switch (keyPressed) {
                    case ("RIGHT") -> {
                        if (yPosition % Matrix.CELL_SIZE == 0) {
                            xVelocity = xVelocityChange;
                            yVelocity = yVelocityChange;
                            direction = keyPressed;
                        }
                       // System.out.println(yPosition+" " +xPosition);
                        if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE + 1][yPosition / Matrix.CELL_SIZE] == 1) {
                                xVelocity = 0;
                            }
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                DotModel.removeDot(xPosition / Matrix.CELL_SIZE,yPosition / Matrix.CELL_SIZE);
                            }
                        }
                    }
                    case ("LEFT") -> {
                        if (yPosition % Matrix.CELL_SIZE == 0) {
                            xVelocity = xVelocityChange;
                            yVelocity = yVelocityChange;
                            direction = keyPressed;
                        }
                        if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE - 1][yPosition / Matrix.CELL_SIZE] == 1) {
                                xVelocity = 0;
                            }
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                DotModel.removeDot(xPosition / Matrix.CELL_SIZE,yPosition / Matrix.CELL_SIZE);
                            }
                        }


                    }
                    case ("UP") -> {
                        if (xPosition % Matrix.CELL_SIZE == 0) {
                            xVelocity = xVelocityChange;
                            yVelocity = yVelocityChange;
                            direction = keyPressed;
                        }
                        if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE - 1] == 1) {
                                yVelocity = 0;
                            }
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                DotModel.removeDot(xPosition / Matrix.CELL_SIZE,yPosition / Matrix.CELL_SIZE);
                            }
                        }
                    }
                    case ("DOWN") -> {
                        if (xPosition % Matrix.CELL_SIZE == 0) {
                            xVelocity = xVelocityChange;
                            yVelocity = yVelocityChange;
                            direction = keyPressed;
                        }
                        if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE + 1] == 1) {
                                yVelocity = 0;
                            }
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                DotModel.removeDot(xPosition / Matrix.CELL_SIZE,yPosition / Matrix.CELL_SIZE);
                            }

                        }
                    }
                }

                xPosition += xVelocity;
                yPosition += yVelocity;
                pacManView.viewPacMan(xPosition, yPosition, direction);
            }
        };

        timer.start();

    }


}

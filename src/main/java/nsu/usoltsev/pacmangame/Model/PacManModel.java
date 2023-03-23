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
        pacManView = new PacManView(root);
    }

    public void movement() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
//                if (xPosition <= 14 && yPosition >= 0 && yPosition < 220 && xVelocity < 0) {
//                    xVelocity = 0;
//                } else if (xPosition == -20 && yPosition >= 220 && yPosition < 320) {
//                    xPosition = 560;
//                } else if (xPosition <= 14 && yPosition >= 320 && yPosition < 600 && xVelocity < 0) {
//                    xVelocity = 0;
//                } else if (xPosition >= 516 && yPosition >= 0 && yPosition < 220 && xVelocity > 0) {
//                    xVelocity = 0;
//                } else if (xPosition == 560 && yPosition >= 220 && yPosition < 320) {
//                    xPosition= -20;
//                } else if (xPosition >= 516 && yPosition >= 320 && yPosition < 600 && xVelocity > 0) {
//                    xVelocity = 0;
//                }
//
//                if (yPosition >= 516 && xPosition >= 0 && xPosition < 600 && yVelocity>0) {
//                    yVelocity = 0;
//                } else if (yPosition <= 14 && xPosition >= 0 && xPosition < 600 && yVelocity<0) {
//                    yVelocity = 0;
//                }

                switch (direction) {
                    case ("RIGHT") -> {
                        if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE + 1][yPosition / Matrix.CELL_SIZE] == 1) {
                                xVelocity = 0;
                                System.out.println(xPosition + " " + yPosition);
                            }
                        }
                    }
                    case ("LEFT") -> {
                        if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE -1 ][yPosition / Matrix.CELL_SIZE] == 1) {
                                xVelocity = 0;
                                System.out.println(xPosition + " " + yPosition);
                            }
                        }

                    }
                    case ("UP") -> {
                        if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE -1 ] == 1) {
                                yVelocity = 0;
                                System.out.println(xPosition + " " + yPosition);
                            }
                        }
                    }
                    case ("DOWN") -> {
                        if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                            if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE + 1] == 1) {
                                yVelocity = 0;
                                System.out.println(xPosition + " " + yPosition);
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

package nsu.usoltsev.pacmangame.Model;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import nsu.usoltsev.pacmangame.Model.Ghosts.BlueGhostModel;
import nsu.usoltsev.pacmangame.Model.Ghosts.PinkGhostModel;
import nsu.usoltsev.pacmangame.Model.Ghosts.RedGhostModel;
import nsu.usoltsev.pacmangame.Model.Ghosts.YellowGhostModel;
import nsu.usoltsev.pacmangame.View.PacManView;

public class PacManModel {
    private int xVelocity;
    private int yVelocity;
    private int xPosition;
    private int yPosition;
    private String direction;
    private int xVelocityChange;
    private int yVelocityChange;
    private int score;
    private String keyPressed;
    private final PacManView pacManView;
    private final BlueGhostModel blueGhostModel;
    private final YellowGhostModel yellowGhostModel;
    private final RedGhostModel redGhostModel;
    private final PinkGhostModel pinkGhostModel;

    public void setxVelocityChange(int xVelocityChange) {
        this.xVelocityChange = xVelocityChange;
    }

    public void setyVelocityChange(int yVelocityChange) {
        this.yVelocityChange = yVelocityChange;
    }

    public void setKeyPressed(String keyPressed) {
        this.keyPressed = keyPressed;
    }

//
//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }
//
//    public int getxPosition() {
//        return xPosition;
//    }
//
//    public void setxPosition(int xPosition) {
//        this.xPosition = xPosition;
//    }
//
//    public int getyPosition() {
//        return yPosition;
//    }
//
//    public void setyPosition(int yPosition) {
//        this.yPosition = yPosition;
//    }
//
//    public int getxVelocity() {
//        return xVelocity;
//    }
//
//    public void setxVelocity(int xVelocity) {
//        this.xVelocity = xVelocity;
//    }
//
//    public int getyVelocity() {
//        return yVelocity;
//    }
//
//    public void setyVelocity(int yVelocity) {
//        this.yVelocity = yVelocity;
//    }

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

        blueGhostModel = new BlueGhostModel(root);
        blueGhostModel.ghostMovement();

        yellowGhostModel = new YellowGhostModel(root);
        yellowGhostModel.ghostMovement();

        redGhostModel = new RedGhostModel(root);
        redGhostModel.ghostMovement();

        pinkGhostModel = new PinkGhostModel(root);
        pinkGhostModel.ghostMovement();

        score = 0;
    }

    void setChanges(int position) {
        if (position % Matrix.CELL_SIZE == 0) {
            xVelocity = xVelocityChange;
            yVelocity = yVelocityChange;
            direction = keyPressed;
        }
    }

    public void movement() {

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                if ((xPosition == blueGhostModel.getxPosition()&& yPosition == blueGhostModel.getyPosition())||
                        (xPosition == redGhostModel.getxPosition()&& yPosition == redGhostModel.getyPosition())||
                        (xPosition == pinkGhostModel.getxPosition()&& yPosition == pinkGhostModel.getyPosition())||
                        (xPosition == yellowGhostModel.getxPosition()&& yPosition == yellowGhostModel.getyPosition())){
                    System.out.println("touch");
                    xVelocity = 0;
                    yVelocity = 0;
                    keyPressed = "STOP";
                }

                    switch (keyPressed) {
                        case ("RIGHT") -> {
                            setChanges(yPosition);
                            // System.out.println(yPosition+" " +xPosition);
                            if (xPosition / Matrix.CELL_SIZE + 1 >= Matrix.CELL_X_COUNT) {
                                if (xPosition % Matrix.CELL_SIZE > Matrix.CELL_SIZE / 2) {
                                    xPosition = -Matrix.CELL_X_COUNT / 2;
                                }
                            } else if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE + 1][yPosition / Matrix.CELL_SIZE] == 1) {
                                    xVelocity = 0;
                                }
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                    DotModel.removeDot(xPosition / Matrix.CELL_SIZE, yPosition / Matrix.CELL_SIZE);
                                    score += 10;
                                }
                            }
                        }
                        case ("LEFT") -> {
                            setChanges(yPosition);
                            if (xPosition / Matrix.CELL_SIZE <= 0) {
                                // System.out.println(xPosition);
                                if (xPosition % Matrix.CELL_SIZE <= -Matrix.CELL_SIZE / 2) {
                                    //System.out.println(xPosition % Matrix.CELL_SIZE);
                                    xPosition = Matrix.CELL_X_COUNT * Matrix.CELL_SIZE + Matrix.CELL_X_COUNT / 2;
                                    System.out.println(xPosition);
                                }
                            } else if (yPosition % Matrix.CELL_SIZE == 0 && xPosition % Matrix.CELL_SIZE == 0) {
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE - 1][yPosition / Matrix.CELL_SIZE] == 1) {
                                    xVelocity = 0;
                                } else if (xPosition / Matrix.CELL_SIZE >= Matrix.CELL_X_COUNT) {
                                    System.out.println("HI");
                                } else if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                    DotModel.removeDot(xPosition / Matrix.CELL_SIZE, yPosition / Matrix.CELL_SIZE);//????
                                    score += 10;
                                }
                            }


                        }
                        case ("UP") -> {
                            setChanges(xPosition);
                            if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE - 1] == 1) {
                                    yVelocity = 0;
                                }
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                    DotModel.removeDot(xPosition / Matrix.CELL_SIZE, yPosition / Matrix.CELL_SIZE);
                                    score += 10;
                                }
                            }
                        }
                        case ("DOWN") -> {
                            setChanges(xPosition);
                            if (xPosition % Matrix.CELL_SIZE == 0 && yPosition % Matrix.CELL_SIZE == 0) {
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE + 1] == 1) {
                                    yVelocity = 0;
                                }
                                if (Matrix.matrix[xPosition / Matrix.CELL_SIZE][yPosition / Matrix.CELL_SIZE] == 2) {
                                    DotModel.removeDot(xPosition / Matrix.CELL_SIZE, yPosition / Matrix.CELL_SIZE);
                                    score += 10;
                                }

                            }
                        }
                        case("STOP")->{
                            xVelocity=0;
                            yVelocity=0;
                        }
                    }

                xPosition += xVelocity;
                yPosition += yVelocity;
                pacManView.viewPacMan(xPosition, yPosition, direction, score);
            }
        };

        timer.start();

    }


}

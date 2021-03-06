package com.hfad.rgbcircles;

public class MainCircle {
    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 30;
    private int x;
    private int y;
    private int radius;


    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = INIT_RADIUS;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1 - x) * MAIN_SPEED /GameManager.getWidth();
        int dy = (y1 - y) * MAIN_SPEED /GameManager.getHeight();
        x += dx;
        y += dy;
    }
}

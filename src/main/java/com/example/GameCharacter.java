package com.example;

public class GameCharacter {
    private int x;
    private int y;

    public GameCharacter(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
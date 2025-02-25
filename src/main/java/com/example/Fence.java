package com.example;

public class Fence {
    private int x;
    private int y;

    public Fence(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isAtPosition(int x, int y) {
        return this.x == x && this.y == y;
    }
}
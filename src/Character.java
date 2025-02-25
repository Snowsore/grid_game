public class Character {
    private int x;
    private int y;

    public Character(int startX, int startY) {
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

    public void interactWith(Object obj) {
        if (obj instanceof Fence) {
            // Logic for interacting with a fence
        } else if (obj instanceof Animal) {
            // Logic for interacting with an animal
        }
    }
}
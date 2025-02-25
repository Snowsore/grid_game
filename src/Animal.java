public class Animal {
    private int x;
    private int y;
    private String type;

    public Animal(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }

    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
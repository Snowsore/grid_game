public class Grid {
    private int width;
    private int height;
    private Object[][] grid;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new Object[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Object getObjectAt(int x, int y) {
        if (isWithinBounds(x, y)) {
            return grid[y][x];
        }
        return null;
    }

    public void placeObject(int x, int y, Object obj) {
        if (isWithinBounds(x, y)) {
            grid[y][x] = obj;
        }
    }

    public void removeObject(int x, int y) {
        if (isWithinBounds(x, y)) {
            grid[y][x] = null;
        }
    }

    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
public class Game {
    private Grid grid;
    private Character player;
    private List<Animal> animals;
    private List<Fence> fences;

    public Game() {
        grid = new Grid(10, 10); // Example grid size
        player = new Character(0, 0); // Starting position
        animals = new ArrayList<>();
        fences = new ArrayList<>();
        initializeGame();
    }

    private void initializeGame() {
        // Initialize animals and fences if needed
        animals.add(new Animal(2, 2)); // Example animal position
        // Additional setup can be done here
    }

    public void update() {
        // Update game state, move animals, check for collisions, etc.
        for (Animal animal : animals) {
            animal.move();
        }
        // Check for interactions between player and animals or fences
    }

    public void render() {
        // Render the grid, player, animals, and fences
        grid.render();
        player.render();
        for (Animal animal : animals) {
            animal.render();
        }
        for (Fence fence : fences) {
            fence.render();
        }
    }

    public void addFence(int x, int y) {
        Fence fence = new Fence(x, y);
        if (grid.isValidPosition(x, y)) {
            fences.add(fence);
        }
    }

    public void removeFence(int x, int y) {
        fences.removeIf(fence -> fence.getX() == x && fence.getY() == y);
    }

    public Character getPlayer() {
        return player;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Fence> getFences() {
        return fences;
    }
}
package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.random.*;

public class Game {
    private Grid grid;
    private GameCharacter player;
    private List<Animal> animals;
    private List<Fence> fences;
    private boolean running;
    RandomGenerator random;

    public Game() {
        grid = new Grid(10, 10); // Example grid size
        player = new GameCharacter(0, 0); // Starting position
        animals = new ArrayList<>();
        fences = new ArrayList<>();
        initializeGame();
        random = RandomGeneratorFactory.getDefault().create();
    }

    public void start() {
        running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            render();
            System.out.println("Enter command (w/a/s/d to move, f to create fence, r to remove fence, q to quit): ");
            String command = scanner.nextLine();
            handleInput(command);
            update();
        }
        scanner.close();
    }

    private void initializeGame() {
        animals.add(new Animal(2, 2, "cat")); // Example animal position
    }

    public void update() {
        // Update game state, move animals, check for collisions, etc.
        for (Animal animal : animals) {
            int targetX = animal.getX() + random.nextInt(3) - 1;
            int targetY = animal.getY() + random.nextInt(3) - 1;

            if (!isFenceAt(targetX, targetY) && grid.isValidPosition(targetX, targetY)) {
                animal.setPosition(targetX, targetY);
            }
        }
        // Check for interactions between player and animals or fences
    }

    public void render() {
        for (int y = 0; y < grid.getHeight(); y++) {
            for (int x = 0; x < grid.getWidth(); x++) {
                if (player.getX() == x && player.getY() == y) {
                    System.out.print("P ");
                } else if (isAnimalAt(x, y)) {
                    System.out.print("A ");
                } else if (isFenceAt(x, y)) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    private boolean isAnimalAt(int x, int y) {
        for (Animal animal : animals) {
            if (animal.getX() == x && animal.getY() == y) {
                return true;
            }
        }
        return false;
    }

    private boolean isFenceAt(int x, int y) {

        for (Fence fence : fences) {
            if (fence.getX() == x && fence.getY() == y) {
                return true;
            }
        }
        return false;
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

    private void handleInput(String command) {
        switch (command) {
            case "w":
                player.moveUp();
                break;
            case "s":
                player.moveDown();
                break;
            case "a":
                player.moveLeft();
                break;
            case "d":
                player.moveRight();
                break;
            case "f":
                addFence(player.getX(), player.getY());
                break;
            case "r":
                removeFence(player.getX(), player.getY());
                break;
            case "q":
                running = false;
                break;
            default:
                System.out.println("Invalid command");
                break;
        }
    }

    public GameCharacter getPlayer() {
        return player;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Fence> getFences() {
        return fences;
    }
}
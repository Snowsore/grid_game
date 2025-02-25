package utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {
    private Character character;

    public InputHandler(Character character) {
        this.character = character;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                character.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                character.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                character.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                character.moveRight();
                break;
            case KeyEvent.VK_A: // Create fence
                character.createFence();
                break;
            case KeyEvent.VK_D: // Delete fence
                character.deleteFence();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }
}
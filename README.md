# Grid Game

## Overview
Grid Game is a simple grid-based game where players control a character to interact with animals and create fences to prevent them from escaping. The game is designed to be played using keyboard controls, allowing for an engaging and interactive experience.

## Project Structure
The project consists of the following files:

- **src/Main.java**: The entry point of the game, initializing the game window and starting the game loop.
- **src/Game.java**: Manages the game state, including the grid, characters, animals, and fences. Handles game logic, updates, and rendering.
- **src/Grid.java**: Represents the grid structure of the game, defining its dimensions and managing the placement of characters, animals, and fences.
- **src/Character.java**: Defines the player-controlled character, including movement and interaction methods.
- **src/Animal.java**: Represents animals in the game, such as cats, with properties for position and movement methods.
- **src/Fence.java**: Represents fences that can be created or deleted to prevent animals from escaping, with methods for placement and removal.
- **src/utils/InputHandler.java**: Handles keyboard input for controlling the character, translating key events into movements and actions.

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd grid-game
   ```
3. Build the project using Gradle:
   ```
   ./gradlew build
   ```
4. Run the game:
   ```
   ./gradlew run
   ```

## Gameplay
- Use the arrow keys to move the character around the grid.
- Interact with animals to manage their movement.
- Create and delete fences using designated keys to prevent animals from escaping the grid.

## Contributing
Feel free to contribute to the project by submitting issues or pull requests. Your feedback and contributions are welcome!

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
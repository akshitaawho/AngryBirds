# ANGRY BIRDS
## Overview
Welcome to the Angry Birds-style game! This project is built using the LibGDX framework, providing an engaging and entertaining experience reminiscent of the classic game. Players can launch different types of birds to defeat various pigs across multiple levels. The game features vibrant graphics, sound effects, and smooth gameplay mechanics.

## Features
- **Multiple Bird Types**: Play with different birds (Red, Chuck, and Terrence), each with unique abilities.
- **Challenging Levels**: Navigate through a variety of levels filled with obstacles and enemy pigs (Standard Pig and Fat Pig).
- **Pause Functionality**: Access a pause menu during gameplay to resume, replay, or return to the levels screen.
- **Background Music and Sound Effects**: Enjoy immersive audio with background music and sound effects for button clicks and actions.
- **Settings Screen**: Adjust audio settings and navigate to other screens with ease.
- **Win and Lose Screens**: Visual feedback on player performance with dedicated screens for winning and losing.

## Screens and Classes
### 1. Main Class

The main class initializes the game, sets up the background music, and manages transitions between screens. Key features include:
- **Background Music**: Loops continuously with mute/unmute functionality.
- **Button Click Sound**: Plays when buttons are clicked.

### 2. Screens
- **HomeScreen**: The main menu where players can start the game or access settings.
- **LevelsScreen**: Displays available levels and bird interactions.
- **LevelGameScreen**: The screen where the gameplay occurs. Players launch birds to defeat pigs.
- **PauseScreen**: Allows players to pause the game and choose to replay, continue, or return to the LevelsScreen.
- **WinScreen**: Displays when the player successfully completes a level.
- **LoseScreen**: Displays when the player fails to complete a level.
- **SettingsScreen**: Provides options to adjust music and sound effects, with an option to exit the game.

### 3. Objects

- **Bird Class**: The base class for all bird types with scaling and hover functionality.
- **RedBird Class**: Represents the Red bird.
- **Chuck Class**: Represents the Chuck bird with unique abilities.
- **Terrence Class**: Represents the Terrence bird.
- **Pig Class**: The base class for all pig types.
- **Standard Pig Class**: Represents the regular pig.
- **Fat Pig Class**: Represents the larger, more resilient pig.

## Setup Instructions
Follow the steps below to set up and run the project locally:

1. **Clone the Repository**
   ```bash
   git clone [https://github.com/akanksha23056/AngryBirds.git](https://github.com/akshitaawho/AngryBirds)
Navigate to the Project Directory

bash
Copy code
cd static-gui-game
Open the Project in an IDE Use an IDE that supports LibGDX (e.g., IntelliJ IDEA, Eclipse).

Configure LibGDX Ensure you have the LibGDX dependencies set up correctly in your project. Follow the LibGDX setup guide.

Run the Game Execute the DesktopLauncher class to start the game. You should see the static GUI with all components displayed, although no functionality will be present yet.

Testing the Project
to run, clone the repositpry and run it.

References
During the development of this project, the following online resources were referenced:
LibGDX Documentation
LibGDX Setup Guide
Java Graphics and Game Development Tutorials

Acknowledgments
Thank you for reviewing this project. Your feedback is welcome, and contributions to further enhance the game's functionality will be appreciated!

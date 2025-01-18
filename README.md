# Pocket Imperium

## 📝 Description

Pocket Imperium is a 3X (eXplore, eXpand, eXterminate) space strategy game developed in Java with JavaFX. The game pits 3 players against each other for control of galactic sectors.

## 🎮 Main Features

- Full graphical interface with JavaFX
- Combat and movement system on a hexagonal grid
- Three possible actions: Explore, Expand, and Exterminate
- 3 types of bots with different strategies:
  - Offensive Bot
  - Defensive Bot
  - Random Bot
- Scoring and victory system
- Save/load game feature
- Music and sound effects
- Game action log

## 🛠️ Technologies Used

- Java 21
- JavaFX 21
- Maven 3.13+

## ⚙️ Installation

### Prerequisites

- JDK 21+ installed
- Maven 3.13+ installed
- JAVA_HOME environment variable configured

### Compilation

```bash
mvn clean install
```

### Launch

You can run the game by launching the [PocketImperium](./target/PocketImperium/bin/PocketImperium.bat) file.

Alternatively, you can use :

```bash
mvn javafx:run
```

## 📁 Project Structure

```plaintext
src/
├── main/
│   └── java/
│       └── pimperium/
│           ├── controllers/    # MVC Controllers
│           ├── models/         # Data Models
│           ├── views/          # JavaFX Views
│           ├── players/        # Player Logic
│           ├── elements/       # Game Elements
│           └── utils/          # Utility Classes
```

## 🎯 How to Play

1. Launch the game
2. Choose the number of human players (0-3)
3. Choose the nickname for each player
4. For each bot, choose its strategy
5. Each turn:
   - Choose the order of the 3 actions (Explore, Expand, Exterminate)
   - Execute the actions in the chosen order
   - Score points by controlling systems
6. The player with the most points after 9 turns wins

## 🎵 Controls

- Left click to select hexagons and ships
- Buttons to validate actions
- Command interface to choose the order of actions
- Text area to choose the number of ships or confirm actions
- Button to pause the music

## 💾 Save

- Games are saved at the end of each turn
- Saves are stored in [SavedGames](./SavedGames)

## 👥 Authors

UTT - University of Technology of Troyes

- Romain GOLDENCHTEIN
- Lucas SCHUMMER

## 📄 License

This project is licensed under the MIT License. See the LICENSE file for more details.

## 📚 Documentation

The complete code documentation is available in JavaDoc in the `doc/` folder.

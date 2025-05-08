# F29AI Coursework 1 – A\* Search and Automated Planning

This repository contains the implementation for **Coursework 1** of the **F29AI: Artificial Intelligence** module at Heriot-Watt University.
The objective is to demonstrate the use of search algorithms by implementing **A\*** search within a provided Java framework.

> **A\*** is a heuristic-based pathfinding algorithm that combines the cost from the start node with an estimated cost to the goal,
  providing optimal and efficient solutions in grid-based problems.

## Features

-  Custom `State` and `SearchOrder` implementations
-  Uses Manhattan distance as the heuristic
-  Modular design for defining search problems
-  Tested on two provided grid environments
-  Runs on standard Java with no external dependencies

## 🧩 Key Components

### `AstarState.java`
- Represents a state in the search problem using grid coordinates `(x, y)`
- Implements:
  - `isGoal()` — checks if the state is the target position
  - `getHeuristic()` — calculates Manhattan distance to goal

### `AstarSearchOrder.java`
- Implements the `SearchOrder` interface
- Manages the fringe using a priority queue ordered by F-value (cost + heuristic)
- Ensures optimal exploration order per A\* rules

## Structure

| Component          | Description                                              |
| ------------------ | -------------------------------------------------------- |
| `Node`             | Represents a state in the search tree.                   |
| `SearchOrder`      | Abstracts the search strategy (e.g. BFS, A\*).           |
| `SearchProblem`    | Executes the search given a root node and search order.  |
| `State`            | Interface for defining custom problem states.            |
| `AstarSearchOrder` | Implements A\* using F-value (cost + heuristic).         |
| `AstarState`       | Grid-based state with (x, y) coordinates and goal logic. |

### Testing with Provided Grids
The coursework includes two grids:

Compile the Java files:

```bash
javac -d bin Java/search/\*_/_.java
```

Run the Main class:

```bash
java -cp bin uk.ac.hw.macs.search.example.Main
```

## Requirements:

Java Development Kit (JDK) 8 or higher.


## Contributors: 












# ASIMO Task - Home and Factory Robot (OOP)
## Project Description
This project implements the ASIMO robot concept in two main variants: **ASIMO robots for home use** and **ASIMO robots for factory use**. The aim of the project is to demonstrate the fundamental application of Object Oriented Programming (OOP) principles through real examples.
## OOP Concepts Applied
This code clearly demonstrates the use of several key OOP concepts:
1.  **Inheritance:**
    * The `AsimoHome` and `AsimoFactory` classes are subclasses that inherit the attributes (`name`, `battery power`) and behaviors (`turn on()`, `turn off()`, `move()`) of the base class `Robot`. This reduces code duplication and builds a logical hierarchy.
2.  **Overloading:**
    * **On the `Robot` Class:** The `move()` method is overloaded to allow the robot to move with or without a speed specification:
        * `move(String direction)`: Moves in the specified direction.
        * `move(String direction, int speed)`: Move in a specified direction with a specified speed.
    * **In the `AsimoFactory` Class:** The constructor is overloaded to allow initialization of factory robots with or without an initial `carrying capacity` specification.
        * `AsimoFactory(String name, int Battery power, int Carrying capacity)`
        * `AsimoFactory(String name, int Battery power)`
    * **In the `AsimoFactory` Class (`move` Method):** There is also an example of overloading the `move` method to display robot properties:
        * `move(String name, int Battery power, int Carrying capacity)`: Displays the name, battery power, and transport capacity.
        * `move(String name, int Battery power)`: Displays the name and battery power.
        *(Note: This `move` method in `AsimoFactory` does not control the physical movement of the robot, but rather demonstrates the ability of overloading with different parameters to display information.)*
3.  **Overriding:**
    * **On the `AsimoHome` Class:** The `move(Direction string)` method is overridden from the `Robot` class. This allows `AsimoRumah` to have a different movement implementation (e.g., “move slowly”) compared to the common implementation in the `Robot` class, exhibiting behavior specific to the home version of ASIMO.
## Project Structure
The project consists of several Java files representing the robot classes, as well as image files for the class diagrams:
```
.
├── src/
│   ├── Robot.java
│   ├── AsimoRumah.java
│   ├── AsimoPabrik.java
│   └── Main.java
└── docs/
└── diagram_kelas_asimo.png  
└── README.md
```
## How to Run the Project
To run this code, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Compile Code**
    Open your terminal or command prompt, navigate to the root directory of the project (`Tasks-ASIMO-OOP/`), and compile all Java files:
    ```
    javac src/*.java
    ```
2.  **Run the Program**
    After successfully compiling, you can run the main program:
    ```
    java -cp src Main
    ```
    *(`Main` is the name of the class that contains the `main()` method.)*
## Class Diagram
The following class diagram illustrates the relationship between the `Robot`, `AsimoHome`, and `AsimoFactory` classes, and their attributes and methods:
![ASIMO Class Diagram](docs/diagram_class_asimo.png)

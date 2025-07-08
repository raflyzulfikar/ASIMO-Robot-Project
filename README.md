# OOP Project Assignment: ASIMO Robot (Home & Factory)
## Project Description
This project implements the ASIMO robot concept in two specialized variants: **ASIMO robot for home use (AsimoRumah)** and **ASIMO robot for factory use (AsimoPabrik)**. This implementation fundamentally demonstrates the application of Object Oriented Programming (OOP) principles such as Inheritance, Overloading, and Overriding to create a logical class hierarchy and specific functionality.
The main goal of the project is to demonstrate how OOP concepts can be used to design a modular, maintainable, and extensible system.
## Class Diagram
Here is a class diagram illustrating the relationship between the classes `Robot`, `AsimoRumah`, and `AsimoPabrik`, as well as their attributes and methods, which form the architectural foundation of this project:
![Class Diagram ASIMO Robot](docs/diagram_kelas_asimo.png)
## OOP Concepts Applied
This project clearly applies several key concepts of Object Oriented Programming:
* **Inheritance:**
    * The `AsimoRumah` and `AsimoPabrik` classes are *subclasses* that inherit attributes (`nama`, `dayaBaterai`) and methods (`nyalakan()`, `matikan()`, `gerak()`) from the parent `Robot` class. This promotes code reuse and creates an "is-a" relationship (AsimoRumah is a Robot, AsimoPabrik is a Robot).
**Overloading:**
    * The `Robot` class demonstrates *method overloading* with the `gerak()` method which has two forms:
        * `gerak(String arah)`: For basic movement.
        * `gerak(String arah, int kecepatan)`: For movement with additional speed specifications.
* **Overriding:**
    * The `AsimoRumah` class demonstrates *method overriding* by reimplementing the `gerak(String arah)` method that already exists in the `Robot` class. This allows `AsimoRumah` to have a unique movement behavior (“bergerak pelan”) that is different from the common implementation in the parent class `Robot`.
* **Encapsulation:**
    * While the `nama` and `dayaBaterai` attributes in the `Robot` class use `protected` (allowing direct access by *subclasses*), the specific attributes in *subclasses* (`bisaBersihBersih` in `AsimoRumah` and `kapasitasAngkut` in `AsimoPabrik`) use `private`, which restricts direct access and encourages the use of methods (if there is an explicit *getter/setter*) for data interaction.
## Class Structure
The project consists of four main classes:
### `Robot.java`
* Purpose:** An abstract parent class that represents the basic features of each robot.
* **Attributes:**
    * `protected String nama`: The name of the robot.
    * `protected int dayaBaterai`: The battery power of the robot.
* **Constructor:** `public Robot(String nama, int dayaBaterai)`
* **Method:**
    * `public void nyalakan()`: Turns on the robot.
    * `public void matikan()`: Turns off the robot.
    * `public void gerak(String arah)`: An *overloaded* method for basic movement.
    * `public void gerak(String arah, int kecepatan)`: *overloaded* method for movement with speed.
### `AsimoRumah.java`
* **Purpose:** Represents an ASIMO robot designed specifically for household tasks.
* **Inherits from:** `Robot`
* **Additional Attributes:**
    * `private boolean bisaBersihBersih`: Indicates whether the robot has a cleaning feature.
* **Constructor:** `public AsimoRumah(String nama, int dayaBaterai, boolean bisaBersihBersih))`
* **Additional Methods:**
    * `public void bersihkanRumah()`: Performs cleaning tasks if the feature is available.
* **Overridden Methods:**
    * `@Override public void gerak(String arah)`: Implements specific movement for the home robot (“move slowly”).
### `AsimoPabrik.java`
* **Purpose:** Represents an ASIMO robot specifically designed for tasks in a factory environment.
* **Inherits from:** `Robot`
* **Additional Attributes:**
    * `private int kapasitasAngkut`: The maximum capacity of goods that can be transported by the robot.
* **Constructor:** `public AsimoPabrik(String nama, int dayaBaterai, int kapasitasAngkut)`
* **Additional Methods:**
    * `public void angkutBarang()`: Performs the task of transporting goods.
### `Main.java`
* **Purpose:** The entry point of the program. Responsible for creating instances of `AsimoRumah` and `AsimoPabrik` objects and demonstrating their functionality through method calls.
**Main Contents:**
    * Create an `AsimoRumah` object and call the methods `nyalakan()`, `gerak()`, `bersihkanRumah()`, `matikan()`.
    * Create an `AsimoPabrik` object and call the methods `nyalakan()`, `gerak()`, `angkutBarang()`, `matikan()`.
## Project Structure
This project is organized with the standard Java folder structure:
```
.
├── src/
│   ├── AsimoPabrik.java
│   ├── AsimoRumah.java
│   ├── Main.java
│   └── Robot.java
├── docs/
│   └── class_diagram_asimo.png 
└── README.md
```
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files:**
 Make sure all `.java` files are in the `src/` folder and the class diagram files in `docs/` in your project directory.
2.  **Compile Code:**
 Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/`, `docs/`, and `README.md` are located), and compile all Java files:
 ```
 javac src/*.java
 ```
3.  **Run Program:**
 Once successfully compiled, you can run the main program:
 ```
 java -cp src Main
 ```
## Interaction Example (Console Output)
Here is an example of the output you will see in the console when running the program:
```
ASIMO-Rumah dinyalakan.
ASIMO-Rumah (versi rumah) bergerak pelan ke kiri.
ASIMO-Rumah bergerak ke kanan dengan kecepatan 5 km/jam.
ASIMO-Rumah sedang membersihkan rumah.
ASIMO-Rumah dimatikan.

ASIMO-Pabrik dinyalakan.
ASIMO-Pabrik bergerak ke maju.
ASIMO-Pabrik mengangkut barang seberat 50 kg.
ASIMO-Pabrik dimatikan.
```
## Important Notes and Development Potential
* **Design of the `Robot` Class:** The use of `protected` for the `nama` and `dayaBaterai` attributes in the `Robot` class allows direct access from *subclasses*. For tighter encapsulation, these attributes can be changed to `private` and accessed via `getter` and *setter* `public` methods.
* Testing:** For larger projects, it is useful to add *unit tests* for each class to ensure the functionality works as expected.
* Functionality Expansion:** The robot's functionality can be expanded by adding more specific methods in each class (e.g., `isiBaterai()`, `lakukanPerbaikan()`, or more complex interaction features).
* **Advanced Polymorphism:** To demonstrate polymorphism in more depth, you can create a collection of `Robot` objects and call the `gerak()` method on each one without knowing its specific type at *runtime*.

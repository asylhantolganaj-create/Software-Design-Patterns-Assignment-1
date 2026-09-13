# Software-Design-Patterns-Assignment-1
# Software Design Patterns - Assignment 1: Builder Pattern Implementation

**Author:** Asylkhan Tolganai  
**Group:** SE-2538  
**Repository:** [Software Design Patterns Assignment 1

---

## 1. Overview & Problem Statement
The goal of this assignment is to demonstrate the **Builder Design Pattern** using a complex `Car` domain model. A vehicle object possesses various attributes, such as `carType`, `engine`, `transmission`, `seats`, and `hasGPS`. 

Vehicles naturally exist in different forms (e.g., **Sports Cars** and **SUVs**). While their underlying attributes share a similar data structure, their specific construction steps, configurations, and validation rules differ significantly.

### Solved Challenges:
* **Step-by-step construction:** Clients can configure objects flexibly using readable, fluent method chains.
* **Multiple representations:** Separate concrete builders (`SportsCarBuilder` and `SUVCarBuilder`) construct distinct variations of the same product (`Car`).
* **Validated construction:** The `build()` method guarantees that instantiated objects are valid or throws descriptive exceptions when business constraints are violated.

---

## 2. Architecture & Class Diagram

The system consists of six main entities distributed across three logical packages:

* **`model` Package:**
  * `Car`: The product class storing vehicle properties (`carType`, `engine`, `transmission`, `seats`, `hasGPS`).
  * `CarType`: Enum specifying available vehicle categories (`SPORTS_CAR`, `SUV`).
  * `Transmission`: Enum defining transmission choices (`MANUAL`, `AUTOMATIC`).
* **`builder` Package:**
  * `CarBuilder`: Interface defining configuration operations and the `build()` method.
  * `SportsCarBuilder`: Concrete builder imposing sports car specific invariants.
  * `SUVCarBuilder`: Concrete builder for SUV configurations.
* **`director` Package:**
  * `Director`: Manages standard recipes for predefined configurations (`makeSportsCar`, `makeSUV`).
* **Client:**
  * `Main`: Application entry point demonstrating pattern execution and validation logic.

---

## 3. Clean Code Principles Applied

### Principle 1: Intention-Revealing Names
All class, interface, and method names explicitly convey their intent without requiring redundant inline comments.
* *Example:* `SportsCarBuilder` clearly describes its purpose of constructing sports-style vehicles.

### Principle 2: Small Methods with Single Responsibility
Setter methods in builders handle exactly one attribute assignment and return `this` to support method chaining.
```java
@Override
public CarBuilder setEngine(String engine) {
    this.engine = engine;
    return this;
}

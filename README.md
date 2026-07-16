# Java Design Patterns Tasks

This repository contains **8 standalone Java tasks**, each demonstrating a different **Design Pattern** through a practical real-world scenario. The goal of this project is to understand how design patterns improve code organization, flexibility, maintainability, and scalability while following Object-Oriented Programming (OOP) principles.

## Design Patterns Implemented

### Task 1 – Singleton Pattern: Config Manager
**Objective:** Ensure only one instance of `ConfigManager` exists throughout the application.

**Key Features:**
- Private constructor
- Static instance access
- Single shared configuration object
- Verified using reference comparison (`==`) or hash codes

**Concepts Learned:**
- Singleton Pattern
- Global access point
- Controlled object creation

---

### Task 2 – Factory Pattern: Notification Creator
**Objective:** Create different notification objects without exposing object creation logic.

**Key Features:**
- `Notification` interface
- Email, SMS, and Push notification implementations
- `NotificationFactory` creates objects based on input type

**Concepts Learned:**
- Factory Pattern
- Encapsulation of object creation
- DRY (Don't Repeat Yourself)

---

### Task 3 – Builder Pattern: Meal Order Builder
**Objective:** Construct complex `Meal` objects with multiple optional parameters using a builder.

**Key Features:**
- Chainable builder methods
- Cleaner object creation
- Flexible meal customization

**Concepts Learned:**
- Builder Pattern
- Method Chaining
- KISS (Keep It Simple)

---

### Task 4 – Strategy Pattern: Discount Calculator
**Objective:** Apply different discount algorithms dynamically during checkout.

**Key Features:**
- `DiscountStrategy` interface
- Regular, Premium, and No Discount strategies
- Runtime strategy switching

**Concepts Learned:**
- Strategy Pattern
- Open/Closed Principle (SOLID)
- Runtime behavior changes

---

### Task 5 – Observer Pattern: Stock Price Alert
**Objective:** Notify subscribed investors whenever stock prices change.

**Key Features:**
- Subject (`Stock`)
- Observers (`Investor`)
- Automatic notifications
- Subscribe/Unsubscribe functionality

**Concepts Learned:**
- Observer Pattern
- Event-driven programming
- Publish/Subscribe mechanism

---

### Task 6 – Repository Pattern: Student Data Access
**Objective:** Separate business logic from data storage using a repository.

**Key Features:**
- Repository interface
- In-memory repository implementation
- CRUD operations
- Easily replaceable storage implementation

**Concepts Learned:**
- Repository Pattern
- Dependency Abstraction
- Separation of Concerns

---

### Task 7 – Adapter Pattern: Power Plug Adapter
**Objective:** Allow incompatible plug types to work through a common interface.

**Key Features:**
- Common `Plug` interface
- US Plug Adapter
- EU Plug Adapter
- Driver communicates only through `plugIn()`

**Concepts Learned:**
- Adapter Pattern
- Interface Compatibility
- Legacy System Integration

---

### Task 8 – Facade Pattern: Smart Home Controller
**Objective:** Simplify interaction with multiple smart home subsystems.

**Key Features:**
- Controls Light System
- Controls Thermostat
- Controls Security System
- Single `leaveHome()` method

**Concepts Learned:**
- Facade Pattern
- Simplified APIs
- Reduced Client Complexity

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Design Patterns
- Collections Framework

---

## Design Patterns Covered

- Singleton
- Factory
- Builder
- Strategy
- Observer
- Repository
- Adapter
- Facade

---

## Learning Outcomes

By completing these tasks, I gained practical experience in:

- Applying design patterns to real-world problems
- Writing modular and maintainable code
- Reducing coupling between classes
- Improving code reusability
- Following clean architecture principles
- Understanding SOLID, DRY, and KISS principles

---

## Author

**Muhammad Momin Tariq**

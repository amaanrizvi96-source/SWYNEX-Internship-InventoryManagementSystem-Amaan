# Inventory Management System

## 📌 Project Overview

The Inventory Management System is a console-based Java application developed as part of my Java Developer Internship.

The application helps users manage inventory by adding products, viewing product details, searching products by ID, updating product quantities, and removing products.

The project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts in Java.

## 🎯 Features

* Add electronic products.
* Add clothing products.
* View all available products.
* Search for products using their ID.
* Update product quantities.
* Remove products from inventory.
* Display product-specific details.
* Interactive menu-driven console interface.

## 🛠️ Technologies Used

* **Programming Language:** Java
* **IDE:** IntelliJ IDEA
* **Collection Framework:** ArrayList
* **Input Handling:** Scanner
* **Version Control:** Git
* **Repository Hosting:** GitHub

## 🧠 Object-Oriented Programming Concepts

### 1. Encapsulation

Product information is stored in private fields and accessed or modified using getters and setters.

### 2. Inheritance

The `Electronics` and `Clothing` classes extend the `Product` class and inherit its common properties.

### 3. Abstraction

The `Product` class is declared abstract and defines an abstract `displayDetails()` method.

### 4. Polymorphism

A `Product` reference can hold objects of both `Electronics` and `Clothing`. Method overriding allows each product type to display its specific details.

## 📂 Project Structure

```text
InventoryManagementSystem/
│
├── src/
│   ├── Main.java
│   ├── Product.java
│   ├── Electronics.java
│   ├── Clothing.java
│   └── Inventory.java
│
└── README.md
```

## ▶️ How to Run the Project

1. Install the Java Development Kit (JDK).
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA or another Java IDE.
4. Ensure all Java files are in the correct source directory.
5. Open `Main.java`.
6. Run the `main()` method.
7. Follow the menu displayed in the console.

## 📋 Application Menu

The application provides the following operations:

1. Add Electronics
2. Add Clothing
3. View All Products
4. Search Product
5. Update Product Quantity
6. Remove Product
7. Exit

## ⚠️ Limitations

* Product information is stored in memory and is not permanently saved.
* Data is lost when the application terminates.
* Additional input validation can be implemented to handle invalid data types and duplicate product IDs.

## 🚀 Future Enhancements

* Store inventory data in a database such as MySQL.
* Add user authentication.
* Prevent duplicate product IDs.
* Implement stronger input validation and exception handling.
* Generate inventory reports.

## 👨‍💻 Author

**Amaan Abbas**

Java Developer Internship — Task 2

## 🔗 GitHub Repository

[Inventory Management System](PASTE_YOUR_GITHUB_REPOSITORY_LINK_HERE)

## 📄 License

This project was developed for educational and internship purposes.

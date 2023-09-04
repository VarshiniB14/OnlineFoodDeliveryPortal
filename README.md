# Online Food Delivery Portal
This OOPS (Object-Oriented Programming) project is a Java program that simulates a food delivery application with a restaurant menu system. Here's a brief description of the key components and functionality in this project:

1. Package and Interfaces: The code is organized into a package named `endsem` and defined an interface named `eat` with a method `rating()`.

2. Main Class: The main class is named `hotel4`, and it implements the `eat` interface. This class is responsible for displaying the list of restaurants and handling user interactions.

3. Inner Classes: Three inner classes are defined within `hotel4` (Udupi, Hotel_Bliss, and Hotel_Elite), each representing a different restaurant. These classes provide restaurant-specific information, such as ratings and display messages.

4. Constructor Overloading: Used constructor overloading in the `hotel4` class to create instances with different parameters, allowing you to pass restaurant names and numbers.

5. Menu and Order Logic: The `menu()` and `order()` methods handle displaying the menu and processing user orders. Users can choose items from the menu, specify quantities, and calculate the total price. The program also handles payments and change calculation.

6. Abstraction: Demonstrated the concept of abstraction by creating an abstract class named `details` with an abstract method `det()`. The `abc` class extends `details` and provides concrete implementation for the `det()` method, displaying order details.

7. User Interaction: The program interacts with users through the console, prompting them to choose restaurants, order food, and make payments.

8. Exit Option: Users can choose to exit the program by selecting option 13.

Overall, the project showcases object-oriented principles such as inheritance, interface implementation, constructor overloading, method overriding, and abstraction. It simulates a basic food delivery system where users can select items from a menu, place orders, and view order details. The inclusion of multiple restaurant classes adds variety and demonstrates the use of classes and inheritance.

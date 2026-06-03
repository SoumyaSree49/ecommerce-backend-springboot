# E-Commerce Backend Application

## Overview

This is a Spring Boot based E-Commerce Backend Application developed using Java, Spring Boot, Spring Data JPA, MySQL, and Swagger UI. The project provides REST APIs for managing Products, Users, Cart, and Orders.

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Swagger UI
* Hibernate

## Features

### Product Management

* Add Product
* Get All Products
* Get Product By ID
* Update Product
* Delete Product
* Search Products By Category

### User Management

* Add User
* Get All Users
* Get User By ID
* Update User
* Delete User

### Cart Management

* Add Item To Cart
* Get Cart Details
* Update Cart Quantity
* Delete Cart Item

### Order Management

* Place Order
* Get All Orders
* Get Order By ID
* Update Order Status
* Delete Order

### Additional Features

* Exception Handling using GlobalExceptionHandler
* Custom ResourceNotFoundException
* Input Validation using Bean Validation
* API Documentation using Swagger UI

## Project Structure

src/main/java/com/ecommerce/ecommerce

* controller
* entity
* repository
* service
* exception

## API Documentation

Swagger UI:

http://localhost:8081/swagger-ui/index.html

## Database Configuration

MySQL database is configured through application.properties.

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db

spring.datasource.username=root

spring.datasource.password=your_password

## How to Run

1. Clone the repository
2. Open the project in Eclipse or IntelliJ IDEA
3. Configure MySQL database
4. Run EcommerceApplication.java
5. Open Swagger UI
6. Test APIs

## Author

Soumya Sree

## GitHub Repository

ecommerce-backend-springboot

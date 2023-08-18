# Billing Management System

Billing Management System is a desktop application that facilitates the management of buyers and products through Create, Read, Update, and Delete (CRUD) operations. This user-friendly system allows users to efficiently add, view, modify, and remove product and buyer information.

## Login Page
![login page](https://github.com/zahidulhasan95503/Billing-management-system/assets/102205229/66dfedde-d10a-4b20-9952-e9359234bd3f)
## Home Page
![home page](https://github.com/zahidulhasan95503/Billing-management-system/assets/102205229/c0516bb0-3c0d-46bb-9518-d5744acb29df)
## Add, Delete, update, and view Buyers
![buyers](https://github.com/zahidulhasan95503/Billing-management-system/assets/102205229/52f8c0dc-9596-4f25-b5b6-a44773da4f48)
## Add, Delete, update, and view Products
![products](https://github.com/zahidulhasan95503/Billing-management-system/assets/102205229/72537099-9c67-40f5-be5c-148917a70a50)
## Billing Page
![billing page](https://github.com/zahidulhasan95503/Billing-management-system/assets/102205229/0390da46-64e2-4e0c-a966-4a5fe170a246)


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
  - [Manage Buyers](#manage-buyers)
  - [Manage Products](#manage-products)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Billing Management System simplifies the process of managing buyers and products. With its Java-based frontend and backend, along with MySQL database integration, the application offers an intuitive interface for CRUD operations.

## Features

### Manage Buyers

- **Add Buyers:** Easily add new buyers by providing essential details such as name, contact information, etc.

- **View Buyers:** Browse through a list of buyers to get a quick overview.

- **Update Buyers:** Modify buyer details when necessary.

- **Delete Buyers:** Remove buyers from the database.

### Manage Products

- **Add Products:** Introduce new products by specifying details like name, price, etc.

- **View Products:** Browse through a list of products with relevant information.

- **Update Products:** Make changes to product details as needed.

- **Delete Products:** Remove products from the inventory.

## Technologies Used

- Frontend: Java AWT (Abstract Window Toolkit)
- Backend: Java
- Database: MySQL

## Getting Started

Follow these steps to set up and run the Billing Management System on your local machine.

### Prerequisites

- Java Development Kit (JDK)
- MySQL Server



## Installation

1. Clone the repository

```bash
 git clone https://github.com/zahidulhasan95503/Billing-management-system.git

```
2. Navigate to the project directory   

```bash
 cd Billing-management-system

``` 

## Configuration

1. Configure the database settings in'src/main/resources/application.properties':

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/billingdb
spring.datasource.username=your-username
spring.datasource.password=your-password

```

2.Build and run Application using Java

```bash
javac Main.java
java Main

```
## Usage


1. Run the application using the provided command.
2. Utilize the GUI to manage buyers and products efficiently




## Contributing

Contributions are welcome! If you find issues or want to enhance the functionality of the Billing Management System, feel free to create pull requests or open issues in the GitHub repository.

When contributing, follow coding standards, provide clear commit messages, and ensure thorough testing.


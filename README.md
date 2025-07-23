Spring Boot REST API Project

This is a simple **Spring Boot REST API** project that performs CRUD operations on an `Employee` entity using Spring Data JPA.

## 🔧 Features

- RESTful APIs for CRUD operations
- Spring Boot + Spring Web + Spring Data JPA
- H2 Database (or any other)
- Proper service/repo layer separation
- Ready for Spring Security integration

## 📁 Project Structure

src
└── main
└── java
└── com.example.restapi
├── controller
├── model
├── repository
├── service
└── config (if using security)

pgsql
Copy
Edit

## 🔨 Endpoints

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | /employees        | Get all employees      |
| GET    | /employees/{id}   | Get employee by ID     |
| POST   | /employees/add    | Add new employee       |
| PUT    | /employees/update/{id} | Update employee |
| DELETE | /employees/delete/{id} | Delete employee |

## 🚀 Getting Started

```bash
./mvnw spring-boot:run
Visit: http://localhost:8080/employees

🧪 Tech Stack
Java 17+

Spring Boot

Spring Web

Spring Data JPA

H2 or MySQL

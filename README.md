# RESTful WebService Using Spring Boot

This repository contains a project that demonstrates how to build a RESTful Web Service using **Spring Boot**. The service manages `User` entities with essential details like `name`, `email`, `password`, and `city`.

---

## **Features**
- Create, read, update, and delete (CRUD) operations for `User` entities - HTTP Methods .
- RESTful API design following best practices.
- JSON-based request and response handling.
- Built using **Spring Boot**, leveraging its powerful features for rapid development.

---

## **Tech Stack**
- **Java**: The primary programming language.
- **Spring Boot**: For building and running the application.
- **Spring Data JPA**: For seamless integration with the database.
- **H2 Database**: An in-memory database for testing purposes.
- **Maven**: Dependency management and build tool.

---

## **API Endpoints**

| Method | Endpoint            | Description               |
|--------|---------------------|---------------------------|
| GET    | `/api/users`        | Retrieve all users        |
| GET    | `/api/users/{id}`   | Retrieve a user by ID     |
| POST   | `/api/users`        | Create a new user         |
| PUT    | `/api/users/{id}`   | Update a user by ID       |
| DELETE | `/api/users/{id}`   | Delete a user by ID       |

---

## **User Entity**
The `User` entity contains the following fields:

- `id` (auto-generated)
- `name` (String)
- `email` (String, unique)
- `password` (String)
- `city` (String)

---

## **Setup Instructions**

### **Prerequisites**
1. Install **Java** (JDK 17 or above recommended).
2. Install **Maven**.
3. Install an IDE like **Eclipse** or **Spring Tool Suite**.

### **Steps to Run**
1. Clone the repository:
   ```bash
   git clone https://github.com/its-shikhar89/RESTful-WebService-Using-Spring-Boot.git

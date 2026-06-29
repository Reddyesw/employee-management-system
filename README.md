# Employee Management System

A REST API backend built with Spring Boot for managing employee records.

## Tech Stack
- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Features
- Full CRUD Operations (Create, Read, Update, Delete)
- Exception Handling with clean JSON error responses
- 3-Layer Architecture (Controller to Service to Repository)
- Auto table creation using Hibernate

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/employees | Create employee |
| GET | /api/employees | Get all employees |
| GET | /api/employees/{id} | Get by ID |
| PUT | /api/employees/{id} | Update employee |
| DELETE | /api/employees/{id} | Delete employee |

## Run Locally
1. Clone the repo
2. Update MySQL password in application.properties
3. Run EmployeeManagementApplication.java

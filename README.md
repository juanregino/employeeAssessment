<h1> Coupon Management System </h1>

## Table of Contents

1. Introduction
2. Technical Requirements
3. Project Setup
4. Team Responsibilities
5. Task Management
6. API Documentation
7. Deployment
8. Code Quality and Best Practices
9. Error Handling and Data Validation
10. Conclusion

## 1. Introduction

This document provides a comprehensive guide to developing a Coupon Management System using Spring Boot. The system manages users, coupons, products, and purchase redemptions, following best practices and clean code principles.

Git Repository: Employee Assessment Riwi

## 2. Technical Requirements

- Use a relational database.
- Expose REST endpoints for all operations.
- Use Spring Boot for the application framework.
- Implement error handling and input data validation.
- Utilize a version control system (GIT) with Git Flow.
- Fully document the API with Swagger in English.
- Deploy the API on a PaaS service (e.g., Render, Railway, Heroku).
- Apply clean code principles (SOLID, Design Patterns).
- Use a task manager like Jira to track responsibilities and tasks within the team.

## 3. Project Setup

### Initial Setup

1. **Create a Spring Boot project**:
    - Use Spring Initializr to generate the project.
    - Add necessary dependencies such as Spring Web, Spring Data JPA, MySQL Driver, Lombok, and Spring Boot DevTools.

2. **Set up the relational database**:
    - Use PostgreSQL as the database.
    - Create a database schema named `coupon_management`.
    - Configure the application to connect to the database.

### Entities and Relationships

1. **Create entity classes**:
    - User
    - Coupon
    - Product
    - Purchase
    - RedemptionHistory

2. **Define relationships**:
    - One-to-Many and Many-to-One relationships as per the relational model.

### Repository and Service Layer

1. **Create repositories for each entity**:
    - Define interfaces for User, Coupon, Product, Purchase, and RedemptionHistory.

2. **Create service classes**:
    - Implement CRUD operations and business logic.

### REST Controllers

1. **Create REST controllers**:
    - Expose endpoints for users, coupons, products, and purchase redemptions.

## 4. Team Responsibilities

### Team Leader

- **Name**: Juan Pablo Regino Penagos
- **Role**: Oversee the project, ensure timely delivery, manage task distribution.
- **Strengths**: Leadership and organization.
- **Weaknesses**: Time management under high pressure.
- **Leadership Style**: Servant leadership, ensuring team members have what they need to succeed.

### Team Members

1. **Name**: Ken Castro
    - **Role**: Backend Developer
    - **Strengths**: Database management.
    - **Weaknesses**: Testing, quality assurance.

2. **Name**: Carolina Garcia
    - **Role**: Backend Developer
    - **Strengths**: API development.
    - **Weaknesses**: Database management.

3. **Name**: Simon Franco
    - **Role**: QA
    - **Strengths**: Testing, quality assurance.
    - **Weaknesses**: Code implementation.

## 5. Task Management

We utilized Trello for task management. Each task was clearly defined with specific responsibilities assigned to each team member.

### Example Task

- **Task**: 001 - Creation Entities
- **Assigned To**: Carolina Garcia
- **Description**: Creation of entities for the project (User, Coupon, Product, Purchase, RedemptionHistory)
- **Status**: In Progress

Trello link: [[Trello Dashboard](https://trello.com/invite/b/66a79fd6ce6cbb0289a81143/ATTI92d67fc55270df65d9e2a365eb72c242F188D5C0/employee-assessment)](#)

## 6. API Documentation

- **Tool**: Swagger
- **Language**: English
- **Endpoints**: Documented endpoints include user registration, coupon creation, product listing, purchase creation, and coupon redemption.

## 7. Deployment

- **Service**: Render
- **Deployment Steps**:
    1. Create an account on the chosen PaaS.
    2. Connect the project repository.
    3. Set up environment variables and database connections.
    4. Deploy the application.

## 8. Code Quality and Best Practices

- Followed SOLID principles.
- Applied design patterns where appropriate.
- Ensured clean, readable, and maintainable code.

## 9. Error Handling and Data Validation

- Implemented global exception handling.
- Validated input data at the controller level to ensure data integrity and security.

## 10. Conclusion

Our team demonstrated effective collaboration and communication throughout the project. Under the guidance of the team leader, we divided responsibilities based on individual strengths and areas of expertise, ensuring that each task was completed efficiently and to a high standard. The team leader’s servant leadership style fostered an environment of support and empowerment, allowing team members to take ownership of their tasks while knowing they had the necessary resources and support to succeed.

Our use of Trello for task management was instrumental in keeping the project on track. Each task was clearly defined, assigned, and monitored, allowing us to track progress and make adjustments as necessary. This approach ensured that responsibilities were clear, deadlines were met, and the workload was distributed evenly among team members.

The adoption of Git Flow in our version control practices allowed for a smooth and organized development process. Descriptive commit messages and coherent branching strategies made the codebase easy to navigate and understand, facilitating collaboration and reducing the risk of conflicts.

Overall, this project showcased our commitment to high-quality software development through effective leadership, strategic task management, and rigorous adherence to best practices. The result is a robust and maintainable Coupon Management System that meets the needs of its users and stakeholders. The success of this project is a testament to the power of teamwork and the value of combining diverse skills and expertise towards a common goal.

---

**Project Diagram:**

![Project Diagram](!src/main/resources/imagen.png
)
)

---
red, allowing us to track progress and make adjustments as necessary. This approach ensured that responsibilities were clear, deadlines were met, and the workload was distributed evenly among team members.

The adoption of Git Flow in our version control practices allowed for a smooth and organized development process. Descriptive commit messages and coherent branching strategies made the codebase easy to navigate and understand, facilitating collaboration and reducing the risk of conflicts.

Overall, this project showcased our commitment to high-quality software development through effective leadership, strategic task management, and rigorous adherence to best practices. The result is a robust and maintainable Coupon Management System that meets the needs of its users and stakeholders. The success of this project is a testament to the power of teamwork and the value of combining diverse skills and expertise towards a common goal.

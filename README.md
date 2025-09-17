# 📝 Notes Management System

A simple **Spring Boot** application that demonstrates how to integrate **Liquibase** for database version control and schema migrations, using **PostgreSQL** as the database.

This project is designed to showcase professional database change management, clean code structure, and a lightweight REST API for managing notes.

---

## 🚀 Features

* **Spring Boot** for backend REST API.
* **Liquibase** for database version control.
* **PostgreSQL** as the relational database.
* **JPA/Hibernate** for ORM mapping.
* Simple **User** and **Note** entities with one-to-many relationship.

---

## 🛠️ Tech Stack

* **Java 17+**
* **Spring Boot 3+**
* **Liquibase**
* **PostgreSQL**
* **Maven**

---

## 📂 Project Structure

```
notes-app/
├── src/main/java/com/example/notes
│   ├── NotesApplication.java       # Entry point
│   ├── controller/NoteController.java
│   ├── entity/User.java
│   ├── entity/Note.java
│   └── repository/
│       ├── UserRepository.java
│       └── NoteRepository.java
├── src/main/resources/
│   ├── application.yml             # DB + Liquibase config
│   └── db/changelog/
│       └── db.changelog-master.xml # Liquibase changelog
└── pom.xml
```

---

## ⚙️ Setup & Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/notes-app.git
cd notes-app
```

### 2. Create PostgreSQL Database

```sql
CREATE DATABASE notesdb;
```

### 3. Update Configuration

Edit `src/main/resources/application.yml` with your PostgreSQL credentials:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/notesdb
    username: postgres
    password: password
```

### 4. Run the App

```bash
mvn spring-boot:run
```

Liquibase will automatically:

* Create the `users` and `notes` tables.
* Track changes in `DATABASECHANGELOG` table.

---

## 📌 API Endpoints

### Get All Notes

```http
GET /api/notes
```

**Response Example**:

```json
[
  {
    "id": 1,
    "title": "First Note",
    "content": "This is a sample note",
    "user": {
      "id": 1,
      "username": "john_doe"
    }
  }
]
```

---

## 🔑 Liquibase in Action

* Database schema changes are tracked in `db.changelog-master.xml`.
* Each change is stored in the `DATABASECHANGELOG` table.
* Rollbacks are possible if migrations fail.
* Ensures **consistency across environments** and smooth CI/CD deployments.

---

## 🎯 Interview Talking Points

* Why Liquibase? → Consistent schema migrations, version control, and CI/CD integration.
* Impact? → Reduced deployment issues, improved collaboration, and full history of DB changes.
* Professional takeaway → Demonstrates real-world database change management.

---

## 📜 License

This project is licensed under the MIT License.

---

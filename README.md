# Elo Bank 💳 — Backend

**Elo Bank** is a digital banking platform under development, built with focus on **security**, **scalability** and **best practices**. The project simulates a real bank, allowing account opening, transfers (PIX/TED), Pix key management and secure authentication.

> 🚧 **Project Status:** Active development

---

## 🎯 Project Goal

Build a full stack application from scratch that demonstrates:

- Mastery of **Java, Spring Boot and ecosystem**
- Practical application of **cybersecurity** in a critical domain
- Clean architecture, concurrency and best practices
- Ability to build a **full stack** application

---

## 🚀 Tech Stack

- **Java 17+**
- **Spring Boot** (Web, Data JPA, Security, Validation)
- **JWT** for authentication
- **JPA / Hibernate** with PostgreSQL
- **Maven**
- **Lombok**
- **Bean Validation**

---

## ✅ Progress

### Phase 1 — Domain Modeling (Completed)

| Entity | Description |
|--------|-------------|
| **Customer** | Bank customer (individual) with CPF, email, status |
| **Account** | Bank account (checking/savings) |
| **Transaction** | PIX, TED and debit transfers |
| **PixKey** | Pix keys (CPF, email, phone, random) |
| **LoginAudit** | Login attempts audit |

Applied concepts:

- ✅ JPA relationships (`@OneToMany`, `@ManyToOne`)
- ✅ Bean Validation (`@NotNull`, `@Email`, `@Positive`)
- ✅ Strategic indexes (`cpf`, `accountNumber`, `keyValue`)
- ✅ Enums with `@Enumerated(EnumType.STRING)`
- ✅ Encapsulation with business methods (`block()`, `activate()`)

### Phase 2 — Service Layer (In progress)

- ✅ Repositories for all domain entities
- ✅ CustomerService with dependency injection
- ⏳ DTOs
- ⏳ Spring Security + JWT
- ⏳ REST Controllers

---

## 📦 How to run locally
```bash
# Clone the repository
git clone https://github.com/paulojrtoledo/elobank-backend.git

# Access the folder
cd elobank-backend

# Configure environment variables (PostgreSQL)
# DB_EB_URL, DB_EB_USERNAME, DB_EB_PASSWORD

# Run with Maven
./mvnw spring-boot:run
```

---

## 🔗 Related Repository

Frontend: [elobank-frontend](https://github.com/paulojrtoledo/elobank-frontend)

---

## 📌 Author

**Paulo Emilio de Toledo Jr**
[LinkedIn](https://www.linkedin.com/in/pauloemilio-tech) | [GitHub](https://github.com/paulojrtoledo)

---

## 📝 License

This project is developed for study and portfolio purposes.

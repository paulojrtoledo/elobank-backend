# Elo Bank 💳

**Elo Bank** is a digital banking platform under development, built with focus on **security**, **scalability** and **best practices**. The project simulates a real bank, allowing account opening, transfers (PIX/TED), Pix key management and secure authentication.

> 🚧 **Project Status:** Active development (Phase 1 completed)

---

## 🎯 Project Goal

Build a full stack application from scratch that demonstrates:

- Mastery of **Java, Spring Boot and ecosystem**
- Practical application of **cybersecurity** in a critical domain
- Clean architecture, concurrency and best practices
- Ability to build a **full stack** application (React in the future)

---

## 🚀 Technologies (in use)

### Backend
- **Java 17+**
- **Spring Boot** (Web, Data JPA, Security, Validation)
- **JWT** for authentication
- **JPA / Hibernate** with PostgreSQL
- **Maven**
- **Lombok**
- **Bean Validation**

### Tools
- **PostgreSQL** + **pgAdmin**
- **Git** and **GitHub**

---

## ✅ Phase 1 - Domain Modeling (Completed)

| Entity | Description |
|--------|-------------|
| **Customer** | Bank customer (individual) with CPF, email, status |
| **Account** | Bank account (checking/savings) |
| **Transaction** | PIX, TED and debit transfers |
| **PixKey** | Pix keys (CPF, email, phone, random) |
| **LoginAudit** | Login attempts audit |

### Applied concepts:
- ✅ JPA relationships (`@OneToMany`, `@ManyToOne`)
- ✅ Bean Validation (`@NotNull`, `@Email`, `@Positive`)
- ✅ Strategic indexes (`cpf`, `accountNumber`, `keyValue`)
- ✅ Enums with `@Enumerated(EnumType.STRING)`
- ✅ Encapsulation with business methods (`block()`, `activate()`)

---

## 🗺️ Next steps (Phase 2)

- Implement **repositories and queries**
- Solve **N+1 problem** with `JOIN FETCH`
- Create **DTOs** and **services**
- Implement **Spring Security** + **JWT**
- Session cache with `ConcurrentHashMap`

---

## 📦 How to run locally

```bash
# Clone the repository
git clone https://github.com/paulojrtoledo/elo-bank-backend.git

# Access the folder
cd elo-bank-backend

# Configure environment variables (PostgreSQL)
# DB_EB_URL, DB_EB_USERNAME, DB_EB_PASSWORD

# Run with Maven
./mvnw spring-boot:run
```

---

## 📌 Author

**Paulo Emilio de Toledo Jr**  
[LinkedIn](https://www.linkedin.com/in/pauloemilio-tech) | [GitHub](https://github.com/paulojrtoledo)

---

## 📝 License

This project is developed for study and portfolio purposes.

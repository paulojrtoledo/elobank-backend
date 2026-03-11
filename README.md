# Elo Bank 💳

**Elo Bank** é uma plataforma bancária digital em desenvolvimento, criada com foco em **segurança**, **escalabilidade** e **boas práticas de desenvolvimento**. O projeto simula um banco real, permitindo abertura de contas, transferências (PIX/TED), gerenciamento de chaves Pix e autenticação segura.

> 🚧 **Status do Projeto:** Em desenvolvimento ativo (Fase 1 concluída)

---

## 🎯 Objetivo do Projeto

Construir uma aplicação full stack do zero que demonstre:

- Domínio de **Java, Spring Boot e ecossistema**
- Aplicação prática de **cibersegurança** em um domínio crítico
- Arquitetura limpa, concorrência e boas práticas
- Capacidade de construir uma aplicação **full stack** (React futuramente)

---

## 🚀 Tecnologias (em uso)

### Backend
- **Java 17+**
- **Spring Boot** (Web, Data JPA, Security, Validation)
- **JWT** para autenticação
- **JPA / Hibernate** com PostgreSQL
- **Maven**
- **Lombok**
- **Bean Validation**

### Ferramentas
- **PostgreSQL** + **pgAdmin**
- **Git** e **GitHub**

---

## ✅ Fase 1 - Modelagem de Domínio (Concluída)

| Entidade | Descrição |
|----------|-----------|
| **Customer** | Cliente do banco (PF) com CPF, email, status |
| **Account** | Conta bancária (corrente/poupança) |
| **Transaction** | Transferências PIX, TED e débito |
| **PixKey** | Chaves Pix (CPF, email, telefone, aleatória) |
| **LoginAudit** | Auditoria de tentativas de login |

### Conceitos aplicados:
- ✅ Relacionamentos JPA (`@OneToMany`, `@ManyToOne`)
- ✅ Bean Validation (`@NotNull`, `@Email`, `@Positive`)
- ✅ Índices estratégicos (`cpf`, `accountNumber`, `keyValue`)
- ✅ Enums com `@Enumerated(EnumType.STRING)`
- ✅ Encapsulamento com métodos de negócio (`block()`, `activate()`)

---

## 🗺️ Próximas etapas (Fase 2)

- Implementação de **repositórios e consultas**
- Resolução do problema **N+1** com `JOIN FETCH`
- Criação dos **DTOs** e **services**
- Implementação de **Spring Security** + **JWT**
- Cache de sessões com `ConcurrentHashMap`

---

## 📦 Como executar localmente

```bash
# Clone o repositório
git clone https://github.com/paulojrtoledo/elo-bank-backend.git

# Acesse a pasta
cd elo-bank-backend

# Configure as variáveis de ambiente (PostgreSQL)
# DB_EB_URL, DB_EB_USERNAME, DB_EB_PASSWORD

# Execute com Maven
./mvnw spring-boot:run
```

---

## 📌 Autor

**Paulo Emilio de Toledo Jr**  
[LinkedIn](https://www.linkedin.com/in/pauloemilio-tech) | [GitHub](https://github.com/paulojrtoledo)

---

## 📝 Licença

Este projeto é desenvolvido para fins de estudo e portfólio.

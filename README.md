# Smart Calculator Project

A command-line Java application that performs basic and advanced arithmetic operations with continuous execution mode, input validation, and user-friendly interaction.

## Team Details
- **Project Name:** Smart Calculator
- **Developer / Team:** Vineeth & Team
- **Java Version:** Java 21 LTS
- **Build System:** Apache Maven

---

## Project Structure
```text
SmartCalculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── smartcalculator/
│   │               └── SmartCalculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── smartcalculator/
│                   └── SmartCalculatorTest.java
├── REQUIREMENTS.md
├── pom.xml
├── .gitignore
└── README.md
```

---

## How to Build & Run

### Prerequisites
- JDK 21 installed on system path
- Apache Maven installed (or javac direct compilation)

### Compilation
Using Maven:
```bash
mvn clean compile
```

Direct Java compiler:
```bash
javac -d target/classes src/main/java/com/smartcalculator/SmartCalculator.java
```

### Running the Application
Using Java binary directly:
```bash
java -cp target/classes com.smartcalculator.SmartCalculator
```

Using Maven exec plugin:
```bash
mvn exec:java -Dexec.mainClass="com.smartcalculator.SmartCalculator"
```

---

## Project Phases & Roadmap
- [x] **Phase 1: Project Setup** - Maven structure, `.gitignore`, `README.md`
- [x] **Phase 2: Requirements & Design** - 5 Whys analysis, user stories, functional spec (`REQUIREMENTS.md`)
- [x] **Phase 3: Basic Calculator Logic** - Arithmetic operations (`+`, `-`, `*`, `/`, `%`), Scanner input loop, input validation

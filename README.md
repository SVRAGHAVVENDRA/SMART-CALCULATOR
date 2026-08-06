# SmartCalculator

**Developer:** Vineeth  
A simple command-line calculator built in Java 21 that performs basic arithmetic operations continuously via terminal input.

## Project Structure

```text
SmartCalculator/
├── docs/
│   └── requirements.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── savoira/
│   │               ├── Main.java
│   │               └── SmartCalculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── savoira/
│                   └── SmartCalculatorTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Commands

### Compile Project
```bash
mvn clean compile
```

### Run Application
```bash
mvn exec:java -Dexec.mainClass="com.savoira.Main"
```

### Run Tests
```bash
mvn test
```



## 🔐 Java Encapsulation Programs

This repository contains Java programs that demonstrate the concept of **Encapsulation** in Object-Oriented Programming (OOP).

---

### 🚀 About Encapsulation

Encapsulation is the process of **wrapping data (variables) and code (methods)** together into a single unit (class). It helps in:

* Data hiding 🔒
* Security of data
* Controlled access using getters and setters
* Improving maintainability

---

### 📂 Programs Included

* Basic Encapsulation Example
* Private variables with Getter & Setter methods
* Read-only class example
* Write-only class example
* Data hiding implementation
* Real-world example (Student / Bank Account)

---

### 🛠️ Technologies Used

* Java
* JDK 8 or above
* Any IDE (Eclipse / IntelliJ IDEA / VS Code)

---

### ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

2. Open the project in your IDE

3. Compile and run any `.java` file:

   ```bash
   javac FileName.java
   java FileName
   ```

---

### 📌 Key Concepts Covered

* Private Access Modifier
* Getter and Setter Methods
* Data Hiding
* Controlled Access
* Class Design

---

### 📖 Example

```java
class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Raviraj");
        System.out.println(s.getName());
    }
}
```

---

### 🎯 Purpose

This repository is created for:

* Understanding Encapsulation in Java
* Practicing OOP concepts
* Building strong programming fundamentals

---

### 🤝 Contribution

Feel free to fork this repository and contribute more examples.

---

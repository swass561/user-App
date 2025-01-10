# Bank Management System

A Java-based GUI Banking System that provides comprehensive banking operations with robust error handling and secure transaction processing.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Technical Implementation](#technical-implementation)
- [Screenshots](#screenshots)
- [Development Details](#development-details)

## Features

### 1. Core Feature Implementation
- **Account Management:**
  - Create new bank accounts with validation
  - View account details and balance
  - Update account information
  - Search accounts by account number
  
- **Transaction Processing:**
  - Deposit funds
  - Withdraw funds
  - View transaction history
  - Real-time balance updates

- **Data Management:**
  - Secure data storage using MySQL database
  - Persistent data across sessions
  - Transaction logging

### 2. Error Handling and Robustness
- **Input Validation:**
  - Account number format verification
  - Amount validation for transactions
  - Email format validation
  - Phone number format checking

- **Exception Handling:**
  - Custom exceptions for banking operations
  - Database connection error handling
  - Transaction failure recovery
  - Proper error messages to users

- **Data Integrity:**
  - Transaction rollback on failure
  - Atomic operations
  - Data consistency checks

### 3. Integration of Components
- **Database Integration:**
  - MySQL database connectivity
  - Prepared statements for security
  - Connection pooling

- **GUI Components:**
  - Swing-based user interface
  - Tabbed interface for different operations
  - Interactive tables and forms
  - Responsive design

- **Architecture:**
  - Model-View-Controller (MVC) pattern
  - Service layer architecture
  - Data Access Object (DAO) pattern

### 4. Event Handling and Processing
- **User Interface Events:**
  - Button click handlers
  - Form submission processing
  - Table selection events
  - Window state management

- **Transaction Events:**
  - Real-time balance updates
  - Transaction confirmation dialogs
  - Success/failure notifications
  - Auto-refresh of displays

## Prerequisites
- Java Development Kit (JDK) 11 or higher
- MySQL Server 8.0 or higher
- MySQL Connector/J (JDBC driver)
- IDE (Eclipse, IntelliJ IDEA, or NetBeans)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/bank-management-system.git
```

2. Set up the database:
```sql
CREATE DATABASE bank_db;
USE bank_db;

CREATE TABLE accounts (
    account_number VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    balance DECIMAL(10,2) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20)
);

CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(20),
    transaction_type VARCHAR(20),
    amount DECIMAL(10,2),
    timestamp DATETIME,
    FOREIGN KEY (account_number) REFERENCES accounts(account_number)
);
```

3. Configure database connection:
- Open `src/main/resources/config.properties`
- Update the following properties:
```properties
db.url=jdbc:mysql://localhost:3306/bank_db
db.user=your_username
db.password=your_password
```

4. Build the project:
```bash
javac -d bin src/**/*.java
```

5. Run the application:
```bash
java -cp bin com.bank.main.BankManagementSystem
```

## Project Structure
```
bank-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── bank/
│   │   │   │   │   ├── controller/
│   │   │   │   │   ├── model/
│   │   │   │   │   ├── view/
│   │   │   │   │   ├── util/
│   │   │   │   │   └── main/
│   │   ├── resources/
│   │   │   └── config.properties
│   ├── test/
│   │   └── java/
├── lib/
├── bin/
└── README.md
```

## Technical Implementation

### Core Classes
1. `BankManagementSystem.java` - Main application class
2. `AccountController.java` - Handles account operations
3. `TransactionController.java` - Manages transactions
4. `DatabaseManager.java` - Database connectivity
5. `ValidationUtil.java` - Input validation

### Key Methods
```java
// Account creation
public void createAccount(String name, double initialDeposit, String email, String phone)

// Transaction processing
public boolean processTransaction(String accountNumber, double amount, String type)

// Balance checking
public double getBalance(String accountNumber)

// Input validation
public void validateInput(String input, String type)
```

## Screenshots
(Add screenshots of your application here)

## Development Details

### Database Schema
```sql
-- Accounts table structure
DESC accounts;
+----------------+---------------+------+-----+---------+-------+
| Field          | Type         | Null | Key | Default | Extra |
+----------------+---------------+------+-----+---------+-------+
| account_number | varchar(20)  | NO   | PRI | NULL    |       |
| name          | varchar(100) | NO   |     | NULL    |       |
| balance       | decimal(10,2)| NO   |     | NULL    |       |
| email         | varchar(100) | YES  |     | NULL    |       |
| phone         | varchar(20)  | YES  |     | NULL    |       |
+----------------+---------------+------+-----+---------+-------+
```

### Error Codes
- `E001` - Invalid input
- `E002` - Insufficient funds
- `E003` - Account not found
- `E004` - Database connection error
- `E005` - Transaction failed

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the LICENSE file for details

## Author
Your Name
Contact: your.email@example.com

## Acknowledgments
- Java Swing documentation
- MySQL documentation
- Design pattern implementations

# Payroll Management System

## Overview
The Payroll Management System is a Java-based application designed to streamline the process of managing employee payroll and attendance within an organization. It provides a user-friendly graphical interface for administrators to perform tasks such as adding new employees, managing employee information, recording attendance, calculating salaries, and generating payroll reports. The system utilizes MySQL 8.0 as the backend database to store and retrieve employee data and integrates JCalendar for date selection functionality.

## Features
- **Employee Management**: Add, edit, and delete employee records.
- **Attendance Recording**: Record daily attendance for employees.
- **Salary Calculation**: Automatically calculate salaries based on attendance and predefined parameters such as hours worked, hourly rate, bonuses, and deductions.
- **Payroll Generation**: Generate monthly payroll reports for all employees.
- **Database Integration**: Utilize MySQL 8.0 database to store and manage employee information securely.
- **User Authentication**: Secure login system for administrators to access the application.
- **Graphical User Interface (GUI)**: Intuitive and user-friendly interface for easy navigation and operation.
- **JCalendar Integration**: Utilize JCalendar for date selection in the application.

## Installation
1. **Database Setup**:
   - Install MySQL 8.0 or later.
   - Create a new database named `payroll_management`.
   - Import the provided SQL schema file `payroll_management.sql` to create the necessary tables and data structure.

2. **Java Environment**:
   - Install Java Development Kit (JDK) version 20.
   - Ensure Java is properly configured on your system.

3. **IDE Setup** (Optional):
   - Import the project into your preferred Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA.

4. **Dependencies**:
   - The project relies on the MySQL Connector/J library for Java-MySQL connectivity. Ensure it's included in your project's build path.
   - Add JCalendar library to your project. You can download it from [here](https://toedter.com/jcalendar/).

5. **Configuration**:
   - Open the `each file in the folder to change the database configuration` and provide the MySQL database connection details (hostname, port, username, password).

6. **Build and Run**:
   - Compile and run the `Main.java` file to start the application.

## Usage
1. **Login**: Use the provided credentials to log in as an administrator.
2. **Employee Management**: Add, edit, or delete employee records as needed.
3. **Attendance Recording**: Record daily attendance for employees.
4. **Salary Calculation**: Input employee hours worked, hourly rate, bonuses, and deductions to calculate salaries.
5. **Payroll Generation**: Generate monthly payroll reports for all employees.
6. **Logout**: Securely log out of the application after completing tasks.

## Contributing
Contributions to the Payroll Management System are welcome! If you find any bugs or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).


# 🧾 Java Login Form with Input Validation

A beginner-friendly Java GUI project that demonstrates how to build a basic **Login Form** using **Java Swing**, complete with **input validation** for both username and password fields.

## 📌 Features

✅ Simple graphical login form  
✅ Username and password input fields  
✅ Basic input validation (empty fields, regex, password length)  
✅ Real-time validation feedback  
✅ No external libraries required — uses built-in Java Swing  

## 🎯 Learning Objectives

This project is ideal for **Java beginners** looking to practice:

- GUI development with **Swing**
- **Event handling** with `ActionListener`
- **Input validation** using Java logic and regular expressions
- Structuring a basic desktop application

## 🛠️ Technologies Used

| Tool          | Purpose              |
|---------------|----------------------|
| Java          | Core programming     |
| Java Swing    | GUI development      |
| JDK 8+        | Compilation & running|

## 📂 Project Structure

```
LoginFormProject/
└── LoginForm.java
```

## 🚀 How to Run

### 🔧 Prerequisites
Make sure you have Java installed (JDK 8 or above). You can verify using:
```bash
java -version
```

### 🧪 Steps to Run
1. Clone or download this repository.
2. Open terminal/command prompt.
3. Navigate to the project folder:
   ```bash
   cd LoginFormProject
   ```
4. Compile the program:
   ```bash
   javac LoginForm.java
   ```
5. Run the compiled program:
   ```bash
   java LoginForm
   ```

## 🧠 Validation Logic

| Rule                          | Description                                  |
|-------------------------------|----------------------------------------------|
| Empty fields                  | Displays: `Fields cannot be empty!`          |
| Username format               | Must be alphanumeric (`[a-zA-Z0-9_]+`)       |
| Password length               | Must be **at least 6 characters**            |
| Success condition             | Displays: `Login successful!` in green color|

## ✅ Example Inputs

| Username     | Password   | Result                   |
|--------------|------------|--------------------------|
| (empty)      | 123456     | Fields cannot be empty   |
| user@123     | abcdef     | Invalid username         |
| user1        | 123        | Password too short       |
| user1        | 123456     | Login successful         |

## 📌 Future Improvements (Optional)

- [ ] Add a signup form with user registration  
- [ ] Store users in a file or database  
- [ ] Hide success message after a delay  
- [ ] Add password strength meter  
- [ ] Use `CardLayout` to switch screens after login

## 🙋‍♂️ Author

**Divyanshu Raj**  
🛡️ Aspiring Cybersecurity Professional | Java | InfoSec  
📬 [LinkedIn](https://www.linkedin.com)

## 📃 License

This project is licensed under the MIT License.
# project_07-30

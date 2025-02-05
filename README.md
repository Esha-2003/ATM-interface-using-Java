ATM Interface in Java - A Console-Based Banking System
I developed a fully functional ATM Interface in Java, implementing key banking operations like balance inquiry, deposit, withdrawal, and authentication. This project follows OOP principles and ensures secure user interaction via PIN-based authentication.

Key Features:
✔ User Authentication – Secure access with PIN verification
✔ Check Balance – View current account balance
✔ Deposit Money – Add funds to the account
✔ Withdraw Money – Withdraw funds with sufficient balance check
✔ Interactive Console Menu – Simple, user-friendly interface

Tech Stack:
✅ Java – Core Java, OOP (Encapsulation, Abstraction)
✅ Scanner Class – For user input handling
✅ Exception Handling – Ensuring smooth operations

Code Snippet:
java

Copy code
ATM myAccount = new ATM(10000, 1234);
System.out.print("Enter PIN: ");
int enteredPin = scanner.nextInt();
if (myAccount.authenticate(enteredPin)) {
    System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
}
🔗 Project Repository: [GitHub Link ]

This project strengthened my problem-solving skills and Java programming expertise. Excited to explore database integration and a GUI version next! 🚀

Would love to hear your feedback! What features would you add to enhance this project? #Java #OOP #ATMSystem #Coding #Project

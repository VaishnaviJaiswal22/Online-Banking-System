ONLINE BANKING SYSTEM 
===============
An Online Banking System built using Java and JDBC to manage bank accounts, transactions, and loan applications. This system features a role-based access model, with distinct functionalities for customers and accountants.


About : 

This Online Banking System is a Java-based application designed to provide essential banking functionalities such as account registration, deposits, withdrawals, transaction history, and loan processing. The application uses JDBC for database operations, adhering to the Data Access Object (DAO) pattern to ensure modular and maintainable code.


Features :
        
	Customer Registration: Allows new customers to register and open accounts.
	Account Management: Enables customers to check account balances, make deposits, and withdraw funds.
	Transaction History: Customers can view their transaction history for better financial tracking.



Role-Based Access :
	
 	Customer: Access to account management, transaction history.
	Accountant: Ability to manage customer accounts, process transactions.


Technologies Used :
        
	Programming Language: Java
	Database: MySQL (or any other JDBC-compatible database)
	Libraries/Frameworks:
	JDBC for database connectivity
	DAO (Data Access Object) pattern for structured and organized database operations


Setup :

	Prerequisites
	Java JDK: Make sure Java is installed on your system.
	MySQL: Set up a MySQL database and create tables using the provided SQL scripts.
	JDBC Driver: Ensure the MySQL JDBC driver (mysql-connector-java.jar) is available in your project’s classpath.


Usage :

	Customer: Register and log in to manage accounts, view balances, make transactions, and apply for loans.
	Accountant: Log in to review customer accounts, oversee transactions, and manage loan applications.


Example Commands :

	Register a New Customer: Enter registration details as prompted to create a new customer account.
	Deposit and Withdraw: Enter account details and amount to complete the transaction.
	View Transactions: Access transaction history to view detailed account activities.

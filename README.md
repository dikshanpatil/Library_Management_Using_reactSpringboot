# Library_Management_Using_reactSpringboot
Library Management System.


A Full-Stack application with React and Spring Boot

<img width="800" alt="Screenshot 2023-08-16 at 3 25 50 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/8d24350d-a431-4898-a8f9-fcb3ea2cd857">

This is a Library Management System with an Admin and  User side for the application.   

Admin can perform CRUD operations with books.  
Users can issue, return, renew, and leave a review for the book.  
Uses JWT to authenticate login.  
Uses Okta login to authenticate users.  
Uses Stripe for streamlined payment processing.  


**APIs**

---
**BOOK**   

---  

    Get Mapping to find whether a particular book is checked out by the user.
    Get Mapping to find the number of books checked out by the user.
    Put Mapping to add checked out books in the database.
    Put Mapping for the return book.
    Put Mapping for the renewal of the book.
    		{
    			“user_email” : “xyz@gmail.com”,
    			“Id” : “15”
            }

**Admin**  

---  

    PutMapping to increase the count of a particular book
    PutMapping to decrease the count of a particular book.
    PostMapping to add a new book.
    PostMapping to delete a book. 
        {
    		“userType” : “admin”,
    		“Id” : “15”
        }

 
**Messages**  

---  

    PostMapping to post user questions.
    PutMapping for admin response to the questions.
        {
    		“userType” : “admin”,
    		“question” : “”,
    		“Id” : “15”
        }
  
**Payment**  

---  

    PutMapping to indicate the user for successful payment.
        {
    		“user_email” : “xyz@gmail.com”
        }
    	
**Review**  

---  

    GetMapping to check whether the user has already given the review.
    PostMapping to post the review.
        {
    	    “user_email” : “xyz@gmail.com”,
    	    “Id” : “15”,
            “message” : “hello it was a great book !”
        }
 

**Setup Required**  

---  

    1. Git  
    2. Visual Studio Code  
    3. NVM  
    	The website for nvm is: https://github.com/nvm-sh/nvm  
    4. Install Node  
    5. Install TSC - TypeScript Compiler   
    6. Java Development Kit (JDK)  
    7. Java IDE   
    8. Maven  
    9. MySQL Database and MySQL Workbench.    

**SETUP DATABASE**   

---  

 Running this scripts will have your database ready - 
 https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/tree/main/01-starter-files/Scripts
    
**Screenshots**  

---  


**HomePage Component**    

---  


**UI for User**  

---  

**UI for Admin**  
<img width="800" alt="Screenshot 2024-02-05 at 10.36.41 AM.png" src="Screenshot 2024-02-05 at 10.36.41 AM.png">
---  










Author: Diskha Patil

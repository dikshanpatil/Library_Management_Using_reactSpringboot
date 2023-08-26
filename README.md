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


APIs

    Book
    Get Mapping to find whether a particular book is checked out by the user.
    Get Mapping to find the number of books checked out by the user.
    Put Mapping to add checked out books in the database.
    Put Mapping for the return book.
    Put Mapping for the renewal of the book.
    		{
    			“user_email” : “xyz@gmail.com”,
    			“Id” : “15”
            }

	Admin
    PutMapping to increase the count of a particular book
    PutMapping to decrease the count of a particular book.
    PostMapping to add a new book.
    PostMapping to delete a book. 
        {
    			“userType” : “admin”,
    			“Id” : “15”
        }
    Messages
    PostMapping to post user questions.
    PutMapping for admin response to the questions.
        {
    			“userType” : “admin”,
    			“question” : “”,
    			“Id” : “15”
        }
    
    Payment
    PutMapping to indicate the user for successful payment.
        {
    			“user_email” : “xyz@gmail.com”
        }
    	
    Review
    GetMapping to check whether the user has already given the review.
    PostMapping to post the review.
        {
    	    “user_email” : “xyz@gmail.com”,
    	    “Id” : “15”,
            “message” : “hello it was a great book !”
        }


 


Setup Required-
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
    

**HomePage Component**
   1. Navigation Bar component -
      
   <img width="1440" alt="Screenshot 2023-08-17 at 12 51 05 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/d75db873-8d47-40ea-b9c3-ef216b1636fe">
   
   2. Explore Top Books Component -
      
   <img width="1440" alt="Screenshot 2023-08-17 at 12 51 17 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/30b0b858-9353-4943-9a22-8b0bc6e7bbfc">

   3. Carousel Component -

   <img width="1440" alt="Screenshot 2023-08-17 at 12 51 29 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/ad680296-5cce-4dc9-bcda-d7efc4a36c37">

   4. Hero Component -

   <img width="1440" alt="Screenshot 2023-08-17 at 12 51 51 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/c00f7d2c-9271-4b0b-abe4-3144e9ad08ec">

   5. Library Services Component -
  
   <img width="1440" alt="Screenshot 2023-08-17 at 12 52 09 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/74849af4-1811-4ab0-b0c3-12cc561eb7cd">

   6. Footer Component - 
   
   <img width="1440" alt="Screenshot 2023-08-17 at 12 52 18 PM" src="https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/33af1746-bb3e-42ef-b7a2-4eab245c25dd">


**SETUP DATABASE** 
 Running this scripts will have your database ready - 
 https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/tree/main/01-starter-files/Scripts



This repo uses react for frontend and 
Uses spring boot framework for creating API as backend

Author: Diskha Patil

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

For complete Application working, feel free to watch video :- [![![Screenshot 2024-02-05 at 10 38 37 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/73be1e53-5074-4be6-8bb9-267c254979f7)
(https://img.youtube.com/vi/g6D69o4I7zM)](https://www.youtube.com/watch?v=g6D69o4I7zM)

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

**UI for Admin**  

 ![Screenshot 2024-02-05 at 10 56 35 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/4676879e-311c-41ca-bce4-df0fa8d46960)

---  

**UI for User** 

![Screenshot 2024-02-05 at 10 57 18 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/2e78fa09-5ae7-4f28-8d69-acf38a68ce6c)

---  


 **Pagination Implemented** 
 
![Screenshot 2024-02-05 at 11 01 23 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/99633a10-69a3-4c2d-a0bd-b41854a018b9)

---

**Q/A Section**

![Screenshot 2024-02-05 at 10 36 41 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/25dcdbe3-537b-4692-a9e9-cefc76fe21e2)

---

**Increase/Decrease Quantity of Books**

![Screenshot 2024-02-05 at 10 38 00 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/2f5f763b-b99d-462c-82fd-516de558a190)

---

**Adaptive Design**

![Screenshot 2024-02-05 at 10 38 27 AM](https://github.com/dikshanpatil/Library_Management_Using_reactSpringboot/assets/128430331/1674a446-0024-470c-bb27-269a4f099330)

---

Author: Diksha Nitin Patil

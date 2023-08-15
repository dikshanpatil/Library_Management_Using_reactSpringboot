package com.dikshadesign.springbootlibrary.controller;

import com.dikshadesign.springbootlibrary.entity.Message;
import com.dikshadesign.springbootlibrary.requestModels.AddBookRequest;
import com.dikshadesign.springbootlibrary.service.AdminService;
import com.dikshadesign.springbootlibrary.utils.ExtractJWT;
import net.bytebuddy.build.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    @PutMapping("/secure/increase/book/quantity")
    public void increaseBookQuantity(@RequestHeader(value = "Authorization") String token,
                                     @RequestParam Long bookId) throws Exception{
        String userType = ExtractJWT.payloadJWTExtraction(token, "\"userType\"");
        if(userType == null || !userType.equals("admin")){
            throw new Exception("Administration page only!");
        }
        adminService.increaseBookQuantity(bookId);
    }

    @PutMapping("/secure/decrease/book/quantity")
    public void decreaseBookQuantity(@RequestHeader(value = "Authorization") String token,
                                     @RequestParam Long bookId) throws Exception{
        String userType = ExtractJWT.payloadJWTExtraction(token, "\"userType\"");
        if(userType == null || !userType.equals("admin")){
            throw new Exception("Administration page only!");
        }
        adminService.decreaseBookQuantity(bookId);
    }

    @PostMapping("/secure/add/book")
    public void postBook(@RequestHeader(value = "Authorization") String token,
                         @RequestBody AddBookRequest addBookRequest) throws Exception{
        String userType = ExtractJWT.payloadJWTExtraction(token, "\"userType\"");
        if(userType == null || !userType.equals("admin")){
            throw new Exception("Administration page only!");
        }
        adminService.postBook(addBookRequest);
    }

    @DeleteMapping("/secure/delete/book")
    public void deleteBook(@RequestHeader(value = "Authorization") String token,
                           @RequestParam Long bookId) throws Exception{
        String userType = ExtractJWT.payloadJWTExtraction(token, "\"userType\"");
        if(userType == null || !userType.equals("admin")){
            throw new Exception("Administration page only!");
        }
        adminService.deleteBook(bookId);
    }
}

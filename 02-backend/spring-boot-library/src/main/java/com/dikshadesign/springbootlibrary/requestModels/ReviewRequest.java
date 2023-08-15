package com.dikshadesign.springbootlibrary.requestModels;

import lombok.Data;

import java.util.Optional;

@Data
public class ReviewRequest {
    private Long bookId;

    private double rating;

    //keeing it optional becuase cutomer may be or may not leave a review of book
    private Optional<String> reviewDescription;
}

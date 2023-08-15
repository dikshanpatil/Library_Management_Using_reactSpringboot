package com.dikshadesign.springbootlibrary.requestModels;

import lombok.Data;

@Data
public class AddBookRequest {

    private String title;
    private String author;
    private String description;
    private int copies;
    private String category;
    private String img;
}
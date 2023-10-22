package com.example.Exercise.controller;

import com.example.Exercise.beans.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String sayHelloWorld(){
        return "Hello World";
    }

//    @RequestMapping(value = {"/book","/core-java","/java"},
//    method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping(value = {"/book","/core-java","/java"})
    public Book getBook(){
        Book book= new Book(1,"Core Java","Learn Core JAva");
        return book;
    }

}

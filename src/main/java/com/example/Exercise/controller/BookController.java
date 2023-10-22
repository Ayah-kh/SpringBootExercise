package com.example.Exercise.controller;

import com.example.Exercise.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("/hello-world")
    @ResponseBody
    public String sayHelloWorld(){
        return "Hello World";
    }

    @RequestMapping("/book")
    @ResponseBody
    public Book getBook(){
        Book book= new Book(1,"Core Java","Learn Core JAva");
        return book;
    }

}

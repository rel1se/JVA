package com.example.practice14.controller;

import com.example.practice14.entity.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class BookController {
    private ArrayList<Books> list2 = new ArrayList<>();


    @PostMapping(value = "/add-book")
    @ResponseBody
    public String createGroup(@RequestParam("bookname") String name, @RequestParam("creationDate") String creationDate) {
        System.out.println(name);
        Books books = new Books(name,creationDate);
        list2.add(books);
        return books.toString();
    }

    @GetMapping(value = "/show-book")
    @ResponseBody
    public Object[] showGroups() {
        return list2.stream()
                .filter(item -> item instanceof Books).toArray();
    }

    @GetMapping(value = "/delete-book")
    @ResponseBody
    public boolean deleteGroup(@RequestParam("bookname") String name) {
        int temp = list2.size();
        list2.removeIf(i -> i.toString().equals(name));
        return temp != list2.size() ?  true :  false;
    }
}

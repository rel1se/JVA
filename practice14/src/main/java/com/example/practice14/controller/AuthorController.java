package com.example.practice14.controller;

import com.example.practice14.entity.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthorController {
    private ArrayList<Author> list = new ArrayList<>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getTestPage() {
        return "author.html";
    }

    @PostMapping(value = "/add-author")
    @ResponseBody
    public String createAuthor(@RequestParam("name") String name,@RequestParam("surname") String surname, @RequestParam("middlename")String middlename, @RequestParam("birthdate")String birthdate) {
        System.out.println(name + " " + surname + " " + middlename + " " + birthdate);
        Author author = new Author(name, surname, middlename,birthdate);
        System.out.println(author.getFirstName());
        list.add(author);
        System.out.println(author);
        return author.toString();
    }

    @GetMapping(value = "/show-author")
    @ResponseBody
    public Object[] showAuthor() {
        return list.stream()
                .filter(item -> item instanceof Author).toArray();
    }

    @GetMapping(value = "/delete-author")
    @ResponseBody
    public boolean deleteAuthor(@RequestParam("name") String name,@RequestParam("surname") String surname, @RequestParam("midlename")String midlename, @RequestParam("birthdate")String birthdate) {
        List<Author> rList = new ArrayList<>();
        list.stream()
                .filter(item -> item instanceof Author)
                .map(Author.class::cast)
                .filter(author -> author.getFirstName().equals(name) &&
                        author.getLastName().equals(surname) &&
                        author.getMiddleName().equals(midlename) &&
                        author.getBirthDate().equals(birthdate))
                .forEach(rList::add);
        list.removeAll(rList);
        return rList.size() != 0 ?  true :  false;
    }

}

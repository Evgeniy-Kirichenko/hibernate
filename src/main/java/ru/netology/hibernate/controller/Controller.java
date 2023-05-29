package ru.netology.hibernate.controller;

import lombok.AllArgsConstructor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.Repository;
import java.util.List;
@AllArgsConstructor
@RestController
public class Controller {

    private Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> getProductName(@RequestParam(value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }
}

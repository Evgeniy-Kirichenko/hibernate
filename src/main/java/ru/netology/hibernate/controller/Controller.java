package ru.netology.hibernate.controller;

import lombok.AllArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonKey;
import ru.netology.hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class Controller {

    @Autowired
    private PersonRepository personRepository;


    @GetMapping("/persons/city")
    public List<Person> findPersonByCityOfLiving(String city) {
        return personRepository.findPersonByCityOfLiving(city);
    }

    @GetMapping("/persons/age")
    public List<Person> findByPersonKeyAge(int age) {
        return personRepository.findPersonByPersonKey_AgeBeforeOrderByPersonKeyAsc(age);
    }
    @GetMapping("/persons/name&surname")
    public Optional<Person> findByPersonKeyAge(String name, String surname) {
        return personRepository.findPersonByPersonKey_NameAndPersonKey_Surname(name,surname);
    }
}


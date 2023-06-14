package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonKey> {
    List<Person> findPersonByCityOfLiving(String cityOfLiving);
    List<Person> findPersonByPersonKey_AgeBeforeOrderByPersonKeyAsc (int age);
    Optional<Person> findPersonByPersonKey_NameAndPersonKey_Surname(String name, String surname);
}
package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonKey> {

    @Query("select p from Person p where p.cityOfLiving = :city")
    List<Person> findDyPersonCityQuery(String city);
    @Query("select p from Person p where p.personKey.age < :age order by p.personKey.age")
    List<Person> findPersonByAgeQuery(int age);
  @Query("select p from Person p where p.personKey.name = :name and p.personKey.surname =:surname")
    Optional<Person> findPersonByNameAndSurnameQuery(String name, String surname);

}
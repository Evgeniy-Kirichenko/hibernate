package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import ru.netology.hibernate.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNamedQuery("findPersonByCity");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();
        return personList;

    }

}

package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Person")
@Table(name = "person")
@NamedNativeQuery(
        name = "findPersonByCity",
        query = "select * from homework.person p where p.city_of_living = :city"
)

public class Person {
    @EmbeddedId
    private PersonKey personKey;

@Column(name = "phone_number",nullable = false, length = 18)
    private String phoneNumber;

@Column(name = "city_of_living",nullable = false,length = 50)
    private String cityOfLiving
        ;

}

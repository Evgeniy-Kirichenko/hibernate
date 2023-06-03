package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(name="phone_number", nullable = false)
    private String phoneNumber;

    @OneToMany
    @JoinColumn(name ="customer_id")
    @ToString.Exclude
    private List<Order> ordersList;

    public void addOrderToCustomer(Order order){
        if (ordersList == null){
            ordersList = new ArrayList<>();
        }
        ordersList.add(order);
    }

}

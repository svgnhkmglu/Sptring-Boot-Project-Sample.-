package com.example.demo.Payment;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    // added new library lombok.
    //

    @Id
    @SequenceGenerator(
            name = "payment_sequence",
            sequenceName = "payment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "payment_sequence"
    )
    private long id;
    private String name;
    private String email;
    private LocalDate date;
    private int age;




    public Payment(String name, String email, LocalDate date, int age) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.age = age;
    }



}

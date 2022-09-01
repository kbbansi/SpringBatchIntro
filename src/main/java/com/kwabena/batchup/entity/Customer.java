package com.kwabena.batchup.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_info")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "ANNUAL_INCOME")
    private Double annualIncome;

    @Column(name = "SPENDING_SCORE")
    private Integer spendingScore;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

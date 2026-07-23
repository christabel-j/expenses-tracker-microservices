package com.christabelj.expenses.expense.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "expenses")

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

@Builder

public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2) // precision = 10 — total number of digits (10 digits total), scale = 2 — digits after the decimal point
    private BigDecimal amount;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "categoryId", nullable = false, updatable = false)
    private UUID categoryId;

    @Column(name = "date", nullable = false)
    private LocalDate date;
}

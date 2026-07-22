package com.christabelj.expenses.expense.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "expenses")

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

@Builder

public class Expense {
}

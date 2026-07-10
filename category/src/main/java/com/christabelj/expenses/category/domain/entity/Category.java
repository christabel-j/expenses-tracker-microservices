package com.christabelj.expenses.category.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity // mark as table entity (row)
@Table(name = "categories")

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

}

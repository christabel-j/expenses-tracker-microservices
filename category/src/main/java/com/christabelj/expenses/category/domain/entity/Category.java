package com.christabelj.expenses.category.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity // mark as table entity (row)
@Table(name = "categories")

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

@Builder

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;


    @Column(name = "category_name", nullable = false, length = 100)
    private String name;

}

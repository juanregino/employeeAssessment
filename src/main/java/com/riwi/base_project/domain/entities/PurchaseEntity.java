package com.riwi.base_project.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "purchase")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private double subtotal;
    @Column(nullable = false)
    private double total;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate dueDate;

}

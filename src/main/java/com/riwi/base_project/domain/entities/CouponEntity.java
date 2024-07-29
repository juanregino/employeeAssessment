package com.riwi.base_project.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "coupon")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String code;
    @Column(nullable = false)
    private int discountRate;
    @Column(nullable = false)
    private Boolean isActive;
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate dueDate;

}

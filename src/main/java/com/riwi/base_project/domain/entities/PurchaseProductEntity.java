package com.riwi.base_project.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "purchase_product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseProductEntity {
    @Id
    private Long id;
}
